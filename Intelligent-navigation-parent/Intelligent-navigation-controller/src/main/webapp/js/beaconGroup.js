
/*var access_token = "";
//获取access_token
function getAccess_token(){
	$.ajax({
		type:"post",
		url:"wxtoken_getWxConfig.action",
		data:{},
		dataType:"JSON",
		success:function(data){
			access_token=data.accessToken;
			getGroupList();
		},
		error:function(){
			alert("获取access_token失败!");
		}
	});
}*/
/**
 * 创建新分组
 */
function createGroup(){
	var createGroupName = document.getElementById("createGroupName").value;
	$.ajax({
		type:"post",
		url:"beaconGroup_createGroup.action",
		data:{
			"group_name":createGroupName
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode==0){
				alert("创建新分组成功！");
				getGroupList();
			}else
				alert("创建新分组失败！");
		},
		error:function(){
			alert("创建分组失败!");
		}
	});
}
/**
 * 修改分组的名称
 */
function updateGroup(groupid){
	var newGroupName = document.getElementById("newGroupName").value;
	if(newGroupName == null||newGroupName==" "||newGroupName==""){
		alert("请在上方输入新的组名！");
		return;
	}
	$.ajax({
		type:"post",
		url:"beaconGroup_updateGroup.action",
		data:{
			"group_id":groupid,
			"group_name":newGroupName
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode==0){
				alert("修改分组名成功!");
				getGroupList();
			}else{
				alert("修改分组名失败!");
			}
		},
		error:function(){
			alert("修改分组失败!");
		}
	});
}

function deleteGroup(groupid){
	if (!confirm("确认要删除？")) {
    	window.event.returnValue = false;
    	return;
	}
	$.ajax({
		type:"post",
		url:"beaconGroup_deleteGroup.action",
		data:{
			"group_id":groupid
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode==0){
				alert("删除分组成功!");
				getGroupList();
			}else if(data.errcode==9001054){
				alert("无法删除分组，分组内还包含设备，请删除设备之后再执行操作!");
			}
		},
		error:function(){
			alert("删除分组失败!");
		}
	});
}
//获取分组列表
function getGroupList(){
	//document.getElementById("groupListBotton").setAttribute("disabled", true);
	$("#groupListBotton").hide();
	$.ajax({
		type:"post",
		url:"beaconGroup_getGroupList.action",
		data:{
			"begin": 0,
			"count": 999
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode!=0){
				alert("请求错误！");
				return;
			}
			//alert(data);
			//var optionString = "<option value= >--请选择--</option>";
			//$("#selectedGroup").find('option').remove();
			var headstr= "";
			var bodystr="";
			headstr="<tr>"+"<th>分组ID</th><th>分组名称</th><th>操作</th>"+"</tr>";
			document.getElementById("head").innerHTML=headstr;
			document.getElementById("body").innerHTML=bodystr;
			//alert(data.errmsg);
			//bodystr+="<tr>";
			var groupList = data.data.groups;
			$.each(groupList,function(i,group){
				//optionString +="<option value="+ group.group_id +">"+group.group_name+"</option>";
				bodystr += "<tr>"+"<td>"+group.group_id+"</td>";
				//bodystr += "<td>"+"<input id = "+group.group_id+" value="+group.group_name+">"+"</td>";
				bodystr += "<td>"+group.group_name+"</td>";
				bodystr += "<td>"+"<a a href=# onclick=updateGroup("+group.group_id+")"+
				">修改分组名</a> | "+"<a href=# onclick=deleteGroup("+group.group_id+")"+">"+"删除</a> | "+
				"<a href=# onclick=getGroupDetail("+group.group_id+")"+">"+"查看详情</a> |"+
				"<a href=# onclick=deleteAllInGroup("+group.group_id+")"+">"+"删除分组内beacon(耗时操作)</a> "+
				"</td>"+"</tr>";
			});
			//bodystr += "</tr>";
			document.getElementById("body").innerHTML=bodystr;
			//if (selectedGroup.options.length == 0){
            //    $("#selectedGroup").html(optionString);//添加
            //    $("#selectedGroup").selectpicker('refresh');//刷新
        	//}
		},
		error:function(){
			alert("获取分组列表失败!");
		}
	});
}
//获取分组下拉列表
function getGroupList2(){
	$.ajax({
		type:"post",
		url:"beaconGroup_getGroupList.action",
		data:{
			"begin": 0,
			"count": 999
		},
		dataType:"JSON",
		success:function(data){
			//alert(data);
			var optionString = "<option value= >--请选择--</option>";
			$("#selectedGroup").find('option').remove();
			var groupList = data.data.groups;
			$.each(groupList,function(i,group){
				optionString +="<option value="+ group.group_id +">"+group.group_name+"</option>";
			});
			if (selectedGroup.options.length == 0){
				$("#selectedGroup").html(optionString);//添加
				$("#selectedGroup").selectpicker('refresh');//刷新
			}
		},
		error:function(){
			alert("获取分组列表失败!");
		}
	});
}
var currentPage = 1;
var pagesize =20;
var totalPage = 0;
var currentGroup;//记录当前groupID
function getGroupDetail(groupid){
	//document.getElementById("groupListBotton").setAttribute("disabled", false);
	$("#groupListBotton").show();
	var begin = pagesize*(currentPage-1);
	var count = pagesize;
	if(currentGroup!=groupid)//分组发生改变
		currentPage = 1;
	currentGroup = groupid;
	$.ajax({
		type:"post",
		url:"beaconGroup_getGroupDetail.action",
		data:{
			"group_id":groupid,
			 "begin":begin,
			 "count":count
		},
		dataType:"JSON",
		success:function(data){
			totalPage = Math.ceil(data.data.total_count/pagesize);
			var headstr= "";
			var bodystr="";
			headstr="<tr>"+"<th>设备ID</th><th>UUID</th><th>major</th><th>minor</th><th>操作</th>"+"</tr>";
			document.getElementById("head").innerHTML=headstr;
			document.getElementById("body").innerHTML=bodystr;
			//alert(data.errmsg);
			if(data.errcode==0){
				var deviceList = data.data.devices;
				$.each(deviceList,function(i,device){
					//alert(device.device_id);
					bodystr += "<tr><td>"+device.device_id+"</td>";
					bodystr += "<td>"+device.uuid+"</td>";
					bodystr += "<td>"+device.major+"</td>";
					bodystr += "<td>"+device.minor+"</td>";
					bodystr += "<td>"+//"<a href=# onclick=updateGroup("+data.data.group_id+")"+">修改</a> | "+
					"<a href=# onclick=deleteDevice("+groupid+","+device.device_id+");"+">"+"从该分组删除</a></td></tr>";
				});
			}
			document.getElementById("body").innerHTML=bodystr;
			//分页信息
			var pageInfoString = "<b>共["+data.data.total_count+"]条记录 # 共["+totalPage+"]页 # 第["+currentPage+"]页</b>";
			document.getElementById("page_info").innerHTML=pageInfoString;
		},
		error:function(){
			alert("服务器错误!");
		}
	});
}
//该函数在beacon_list页面中使用
function addDevice(beaconid){
	var groupid =document.getElementById("selectedGroup").value;
	if(groupid == null){
		alert("请选择分组！");
		return;
	}
	$.ajax({
		type:"post",
		url:"beaconGroup_addDevice.action",
		data:{
			"group_id": groupid,
			"beacon_id":beaconid
			 
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode==0){
				alert("添加成功！");
				getBeaconListByConditions(0);
			}
			else
				alert("添加失败！");
		},
		error:function(){
			alert("添加设备失败!");
		}
	});
}
/**
 * 删除单个设备
 */
function deleteDevice(groupid,deviceid){
	if (!confirm("确认要删除？")) {
    	window.event.returnValue = false;
    	return;
	}
	$.ajax({
		type:"post",
		url:"beaconGroup_deleteDevice.action",
		data:{
			//"group_id": groupid,
			"device_id":deviceid    
	        //"uuid":uuid,    
	        //"major":major,
	        //"minor":minor
			 
		},
		dataType:"JSON",
		success:function(data){
			if(data.errcode==0){
				alert("删除成功！");
				getGroupDetail(groupid);
			}
			else
				alert("删除失败！");
		},
		error:function(){
			alert("删除设备失败!");
		}
	});
}
/**
 * 删除对应分组内的所有的设备
 */
function deleteAllInGroup(groupid){
	if (!confirm("确认要删除？")) {
    	window.event.returnValue = false;
    	return;
	}
	$.ajax({
		type:"post",
		url:"beaconGroup_deleteAllDeviceInGroup.action",
		data:{
			"group_id": groupid
		},
		dataType:"JSON",
		success:function(data){
			if(data.code==40010){
				alert("删除该分组所有设备成功！");
				getGroupList();
			}
			else
				alert("删除失败！");
		},
		error:function(){
			alert("服务器错误!");
		}
	});
}
/**
 * 设备列表的翻页
 */
function device_prePage(){
	if(currentPage>1){
		currentPage=currentPage-1;
		getGroupDetail(currentGroup);
	}
}
function device_nextPage(){
	if(currentPage<totalPage){
		currentPage=currentPage+1;
		getGroupDetail(currentGroup);
	}
}