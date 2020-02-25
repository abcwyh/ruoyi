		//根据父级id查询
		function levelShow(url,name,data) {
			var selectLevel = {
				url: url,
				type: "post",
				dataType: "json",
				data: data,

				success: function(data) {
					getLevel(data,name);
				}
			};
			$.ajax(selectLevel)

		}

		function getLevel(data,selectName){//填充联动

			$("select[name="+"'"+selectName+"'"+"]").empty();
			for(var i=0;i<data.length;i++){
				$("select[name="+"'"+selectName+"'"+"]").append("<option value='"+data[i].dictCode+"'>" + data[i].dictLabel + "</option>");
			}

		}




		$.fn.setForm = function(jsonValue) {
			alert("setForm");
			var obj=this;
			$.each(jsonValue, function (name, ival) {
				var $oinput = obj.find("input:[name=" + name + "]");
				if ($oinput.attr("type")== "radio" || $oinput.attr("type")== "checkbox"){
					$oinput.each(function(){
						if(Object.prototype.toString.apply(ival) == '[object Array]'){//是复选框，并且是数组
							for(var i=0;i<ival.length;i++){
								if($(this).val()==ival[i])
									$(this).attr("checked", "checked");
							}
						}else{
							if($(this).val()==ival)
								$(this).attr("checked", "checked");
						}
					});
				}else if($oinput.attr("type")== "textarea"){//多行文本框
					obj.find("[name="+name+"]").html(ival);
				}else{
					obj.find("[name="+name+"]").val(ival);
				}
			})}

