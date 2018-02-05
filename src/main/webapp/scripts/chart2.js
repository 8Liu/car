 // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById('boot')); 
        
        var option = {
        	    title: {
        	        text: '员工季度销售额曲线',
        	        subtext: '销售额(*万元)'
        	    },
        	    tooltip: {
        	        trigger: 'axis'
        	    },
        	    legend: {
        	        data: ['刘伟', '高峰','赖天翔']
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
        	        data: ['第一季度', '第二季度', '第三季度', '第四季度']
        	    }],
        	    yAxis: [{
        	        type: 'value'
        	    }],
        	    series: [{
        	        name: '刘伟',
        	        type: 'bar',
        	        data: [100, 80, 60,120],
        	        markPoint: {
        	            data: [{
        	                type: 'max',
        	                name: '最大值'
        	            }, {
        	                type: 'min',
        	                name: '最小值'
        	            }]
        	        },
        	        markLine: {
        	            data: [{
        	                type: 'average',
        	                name: '平均值'
        	            }]
        	        }
        	    }, {
        	        name: '高峰',
        	        type: 'bar',
        	        data: [200,150,120,90],
        	        markPoint: {
        	            data: [{
        	                type: 'max',
        	                name: '最大值'
        	            }, {
        	                type: 'min',
        	                name: '最小值'
        	            }]
        	        },
        	        markLine: {
        	            data: [{
        	                type: 'average',
        	                name: '平均值'
        	            }]
        	        }
        	    },{
        	        name: '赖天翔',
        	        type: 'bar',
        	        data: [80,110,120,90],
        	        markPoint: {
        	            data: [{
        	                type: 'max',
        	                name: '最大值'
        	            }, {
        	                type: 'min',
        	                name: '最小值'
        	            }]
        	        },
        	        markLine: {
        	            data: [{
        	                type: 'average',
        	                name: '平均值'
        	            }]
        	        }
        	    }]
        	};
        // 为echarts对象加载数据 
        myChart.setOption(option); 