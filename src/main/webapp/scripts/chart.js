 // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById('main')); 
        
        var option = {
        	    title: {
        	        text: '一月份汽车销售额曲线',
        	        subtext: '销售额(*万元)'
        	    },
        	    tooltip: {
        	        trigger: 'axis'
        	    },
        	    toolbox: {
        	        show: true,
        	        feature: {
        	            dataView: {
        	                show: true,
        	                readOnly: false
        	            },
        	            magicType: {
        	                show: true,
        	                type: ['line', 'bar']
        	            },
        	            restore: {
        	                show: true
        	            },
        	            saveAsImage: {
        	                show: true
        	            }
        	        }
        	    },
        	    calculable: true,
        	    xAxis: [{
        	        type: 'category',
        	        data: ['长安福特', '奥迪', '北京现代', '凯迪拉克', '广州本田', '雷克萨斯']
        	    }],
        	    yAxis: [{
        	        type: 'value'
        	    }],
        	    series: [{
        	        name: '销售额',
        	        type: 'bar',
        	        data: [100, 50, 90, 80, 115, 197],
        	    }
        	    
        	    ]
        	};
        // 为echarts对象加载数据 
        myChart.setOption(option); 