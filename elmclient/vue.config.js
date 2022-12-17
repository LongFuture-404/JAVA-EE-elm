module.exports = {
	devServer: {
		port: 8081,
		proxy:{
			'/api':{
				target:'http://localhost:8080/JAVA_EE_war_exploded/',
				changeOrigin:true,
				ws:true,
				pathRewrite:{
					'^/api': ''
				}
			}
		},
	},

	configureWebpack: config => {
		// 为生产环境修改配置...
		if (process.env.NODE_ENV === 'production') {
			config.mode = 'production';
			// 打包文件大小配置
			config.performance = {
				maxEntrypointSize: 10000000,
				maxAssetSize: 30000000
			}
		}
	},
}