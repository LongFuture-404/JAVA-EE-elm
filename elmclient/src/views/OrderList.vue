<template>
	<div class="wrapper">

		<!-- header部分 -->
		<header>
			<p>我的订单</p>
		</header>

		<!-- 订单列表部分 -->
		<h3>未支付订单信息：</h3>
		<ul class="order">
			<li v-for="item in orderArr" v-if="item.child[0].orderState===0">
				<div class="order-info">
					<p>
						{{item.child[0].businessName}}
						<i class="fa fa-caret-down" @click="detailetShow(item)"></i>
					</p>
					<div class="order-info-right">
						<p>&#165;{{item.child[0].orderTotal}}</p>
						<div class="order-info-right-icon">去支付</div>
					</div>
				</div>
				<ul class="order-detailet" v-show="item.isShowDetailet">
          <li v-for="otem in item.child">
						<p>{{otem.foodName}} x {{otem.quantity}}</p>
						<p>&#165;{{otem.foodPrice*otem.quantity}}</p>
          </li>
					<li>
						<p>配送费</p>
						<p>&#165;{{item.child[0].deliveryPrice}}</p>
					</li>
				</ul>
			</li>
		</ul>

		<h3>已支付订单信息：</h3>
		<ul class="order">
			<li v-for="item in orderArr" v-if="item.child[0].orderState===1">
				<div class="order-info">
					<p>
						{{item.child[0].businessName}}
						<i class="fa fa-caret-down" @click="detailetShow(item)"></i>
					</p>
					<div class="order-info-right">
						<p>&#165;{{item.child[0].orderTotal}}</p>
					</div>
				</div>
				<ul class="order-detailet" v-show="item.isShowDetailet">
          <li v-for="otem in item.child">
            <p>{{otem.foodName}} x {{otem.quantity}}</p>
            <p>&#165;{{otem.foodPrice*otem.quantity}}</p>
          </li>
					<li>
						<p>配送费</p>
						<p>&#165;{{item.child[0].deliveryPrice}}</p>
					</li>
				</ul>
			</li>
		</ul>

		<!-- 底部菜单部分 -->
		<Footer></Footer>

	</div>
</template>

<script>
	import Footer from '../components/Footer.vue';
	
	export default{
		name:'OrderList',
		data(){
			return {
				orderArr:[],
				user:{}
			}
		},
		created() {
			this.user = this.$getSessionStorage('user');
			
			this.$axios.post('OrdersController/listOrdersByUserId',this.$qs.stringify({
				userId:this.user.userId
			})).then(response=>{
				let result = response.data;
        let dataInfo = {};
        result.forEach((item, index) => {
          let { orderId } = item;
          if (!dataInfo[orderId]) {
            dataInfo[orderId] = {
              orderId,
              child: []
            }
          }
          dataInfo[orderId].child.push(item);
        });
        let list = Object.values(dataInfo);
        console.log(list)
				for(let orders of list){
					orders.isShowDetailet = false;
				}
				this.orderArr = list;
			}).catch(error=>{
				console.error(error);
			});
		},
		methods:{
			detailetShow(orders){
				orders.isShowDetailet = !orders.isShowDetailet;
			}
		},
		components:{
			Footer
		}
	}
</script>

<style scoped>
	/****************** 总容器 ******************/
	.wrapper {
		width: 100%;
		height: 100%;
	}

	/****************** header部分 ******************/
	.wrapper header {
		width: 100%;
		height: 12vw;
		background-color: #0097FF;
		color: #fff;
		font-size: 4.8vw;

		position: fixed;
		left: 0;
		top: 0;
		z-index: 1000;

		display: flex;
		justify-content: center;
		align-items: center;
	}

	/****************** 历史订单列表部分 ******************/
	.wrapper h3 {
		margin-top: 12vw;
		box-sizing: border-box;
		padding: 4vw;
		font-size: 4vw;
		font-weight: 300;
		color: #999;
	}

	.wrapper .order {
		width: 100%;
	}

	.wrapper .order li {
		width: 100%;
	}

	.wrapper .order li .order-info {
		box-sizing: border-box;
		padding: 2vw 4vw;
		font-size: 4vw;
		color: #666;

		display: flex;
		justify-content: space-between;
		align-items: center;
	}

	.wrapper .order li .order-info .order-info-right {
		display: flex;
	}

	.wrapper .order li .order-info .order-info-right .order-info-right-icon {
		background-color: #f90;
		color: #fff;
		border-radius: 3px;
		margin-left: 2vw;
		user-select: none;
		cursor: pointer;
	}

	.wrapper .order li .order-detailet {
		width: 100%;
	}

	.wrapper .order li .order-detailet li {
		width: 100%;
		box-sizing: border-box;
		padding: 1vw 4vw;
		color: #666;
		font-size: 3vw;

		display: flex;
		justify-content: space-between;
		align-items: center;
	}
</style>
