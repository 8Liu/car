var checks;
	window.onload = function(){
		checks = [
		          ["第一季度","第二季度","第三季度","第四季度"],
		          ["1月份","2月份","3月份","4月份","5月份","6月份","7月份","8月份","9月份","10月份","11月份","12月份"]
		         ];
		
	};
	function change(){
		var one = document.getElementById("one").value;
		var tChild = checks[one];
		var select = document.getElementById("two");
		select.innerHTML ="<option>请选择</option>";
		console.log(select);
		if(tChild){
			for(var i=0;i<tChild.length;i++){
				var opt = document.createElement("option");
				opt.innerHTML=tChild[i];
				select.appendChild(opt);
			}
		}
	}