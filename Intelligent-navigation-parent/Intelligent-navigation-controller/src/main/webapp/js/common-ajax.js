//获取园区信息
function getRegionList(){
	$.ajax({
		type:"post",
		url:"region_getRegionList.action",
		data:{},
		dataType:"JSON",
		success:function(data){
			var optionString = "<option value= >--请选择--</option>";
			$("#selectedRegion").find('option').remove();
			$.each(data,function(i,region){
				optionString +="<option value="+ region.regionID +">"+region.regionName+"</option>";
			})
			if (selectedRegion.options.length == 0){
                $("#selectedRegion").html(optionString);//添加
                $("#selectedRegion").selectpicker('refresh');//刷新
        	}
		},
		error:function(){
			alert("拉取园区信息失败!");
		}
	});
}
//获取园区ID对应的建筑物列表
function getBuildingListByRegionID(){
	var selectedRegionID = document.getElementById("selectedRegion").value;
	$.ajax({
		type:"post",
		url:"building_getBuildingList.action",
		data:{
			selectedRegionID:selectedRegionID
		},
		dataType:"JSON",
		success:function(data){
			var optionString = "<option value= >--请选择--</option>";
			$("#selectedBuilding").find('option').remove();
			$.each(data,function(i,building){
				optionString +="<option value="+ building.buildingID +">"+building.buildingName+"</option>";
			})
			if (selectedBuilding.options.length == 0){
                $("#selectedBuilding").html(optionString);//添加
                $("#selectedBuilding").selectpicker('refresh');//刷新
        	}
		},
		error:function(){
			alert("拉取建筑物信息失败!");
		}
	});
}
//根据查询条件获取蓝牙信标的数据，显示在表格中
var currentPage=1;//当前页
var totalPage =1;
function getBeaconListByConditions(onclickSearch){
	if(onclickSearch==1)
		currentPage=1;
	
	var selectedBuildingID = document.getElementById("selectedBuilding").value;
	var selectedFloor = document.getElementById("selectedFloor").value;
	var selectedUUID = document.getElementById("selectedUUID").value;
	$.ajax({
		type:"post",
		url:"beacon_queryWithConditions.action",
		data:{
			selectedBuildingID:selectedBuildingID,
			selectedFloor:selectedFloor,
			selectedUUID:selectedUUID,
			currentPage:currentPage
		},
		dataType:"JSON",
		success:function(data){
			var tableString = "";
			var listData = data.list;
			totalPage = data.totalPage;
			//alert(listData);
			$.each(listData,function(i,beacon){
				tableString += "<tr>"+"<td>"+beacon.beaconID+"</td>"; //id
				tableString += "<td>"+beacon.deviceID+"</td>";
				tableString += "<td>"+beacon.uUID+"</td>";
				tableString += "<td>"+beacon.major+"</td>";
				tableString += "<td>"+beacon.minor+"</td>";
				tableString += "<td>"+beacon.floor+"</td>";
				tableString += "<td>"+beacon.x+"</td>";
				tableString += "<td>"+beacon.y+"</td>";
				tableString += "<td>"+beacon.h+"</td>";
				tableString += "<td>"+beacon.groupID+"</td>";
				tableString += "<td>"+beacon.building.buildingName+"</td>";
				tableString += "<td>"+"<a href=beacon_toModifyPage.action?beaconID="+beacon.beaconID+">修改</a> | "+
				"<a href=beacon_delete.action?beaconID="+ beacon.beaconID +" onclick="+"delcfm()"+">"+"删除</a> | "+
				"<a href=#" +" onclick= addDevice("+beacon.beaconID+");"+">"+"添加到分组</a> | "+
				"<a href=#" +" onclick= deleteAllBeacon("+beacon.building.buildingID+");"+">"+"删除同建筑物内所有蓝牙</a> "+
				"</td>"+"</tr>";
				//alert("<a href=#" +" onclick= addDevice("+beacon.beaconID+","+beacon.deviceID+","+beacon.uUID+","+beacon.major+","+beacon.minor+");>"+"添加到分组</a>");
			});
			document.getElementById("beaconTable").innerHTML=tableString;
			//分页信息
			var pageInfoString = "<b>共["+data.totalCount+"]条记录 # 共["+data.totalPage+"]页 # 第["+currentPage+"]页</b>";
			document.getElementById("page_info").innerHTML=pageInfoString;
		},
		error:function(){
			alert("拉取蓝牙信标信息失败!");
		}
	});
}
//根据查询条件获取目的地的数据，显示在表格中
function getDestinationListByConditions(onclickSearch){
	if(onclickSearch==1)
		currentPage=1;
	
	var selectedBuildingID = document.getElementById("selectedBuilding").value;
	var selectedFloor = document.getElementById("selectedFloor").value;
	var selectedDestinationName = document.getElementById("selectedDestinationName").value;
	$.ajax({
		type:"post",
		url:"destination_queryWithConditions.action",
		data:{
			selectedBuildingID:selectedBuildingID,
			selectedFloor:selectedFloor,
			selectedDestinationName:selectedDestinationName,
			currentPage:currentPage
		},
		dataType:"JSON",
		success:function(data){
			var tableString = "";
			var listData = data.list;
			totalPage = data.totalPage;
			//alert(listData);
			$.each(listData,function(i,destination){
				tableString += "<tr>"+"<td>"+destination.destinationID+"</td>"; //id
				tableString += "<td>"+destination.destinationName+"</td>";
				tableString += "<td>"+destination.floor+"</td>";
				tableString += "<td>"+destination.x+"</td>";
				tableString += "<td>"+destination.y+"</td>";
				tableString += "<td>"+destination.type+"</td>";
				tableString += "<td>"+destination.building.buildingName+"</td>";
				tableString += "<td>"+"<a href=destination_toModifyPage.action?destinationID="+
				destination.destinationID+">修改</a> | "+"<a href=destination_delete.action?destinationID="+ 
				destination.destinationID +" onclick="+"delcfm()"+">"+"删除</a>"+"</td>"+"</tr>";
				
			})
			document.getElementById("destinationTable").innerHTML=tableString;
			//分页信息
			var pageInfoString = "<b>共["+data.totalCount+"]条记录 # 共["+data.totalPage+"]页 # 第["+currentPage+"]页</b>";
			document.getElementById("page_info").innerHTML=pageInfoString;
		},
		error:function(){
			alert("拉取目的地信息失败!");
		}
	});
}
//根据查询条件获取目的地的数据，显示在表格中
function getIndoorMapListByConditions(onclickSearch){
	if(onclickSearch==1)
		currentPage=1;
	
	var selectedBuildingID = document.getElementById("selectedBuilding").value;
	var selectedFloor = document.getElementById("selectedFloor").value;
	$.ajax({
		type:"post",
		url:"indoorMap_queryWithConditions.action",
		data:{
			selectedBuildingID:selectedBuildingID,
			selectedFloor:selectedFloor,
			currentPage:currentPage
		},
		dataType:"JSON",
		success:function(data){
			var tableString = "";
			var listData = data.list;
			totalPage = data.totalPage;
			//alert(listData);
			$.each(listData,function(i,indoorMap){
				tableString += "<tr>"+"<td>"+indoorMap.indoorMapID+"</td>"; //id
				tableString += "<td>"+indoorMap.floor+"</td>";
				tableString += "<td>"+indoorMap.building.buildingName+"</td>";
				tableString += "<td>"+indoorMap.svgPath+"</td>";
				
				tableString += "<td>"+"<a href=indoorMap_toModifyPage.action?indoorMapID="+
				indoorMap.indoorMapID+">修改</a> | "+"<a href=indoorMap_delete.action?indoorMapID="+ 
				indoorMap.indoorMapID +" onclick="+"delcfm()"+">"+"删除</a>"+"</td>"+"</tr>";
				
			})
			document.getElementById("indoorMapTable").innerHTML=tableString;
			//分页信息
			var pageInfoString = "<b>共["+data.totalCount+"]条记录 # 共["+data.totalPage+"]页 # 第["+currentPage+"]页</b>";
			document.getElementById("page_info").innerHTML=pageInfoString;
		},
		error:function(){
			alert("拉取室内地图信息失败!");
		}
	});
}

//根据查询条件获取trace的数据，显示在表格中
function getTraceListByConditions(onclickSearch){
	if(onclickSearch==1)
		currentPage=1;
	
	var selectedBuildingID = document.getElementById("selectedBuilding").value;
	var selectedFloor = document.getElementById("selectedFloor").value;
	var selectedUserID = document.getElementById("selectedUserID").value;
	$.ajax({
		type:"post",
		url:"trace_queryWithConditions.action",
		data:{
			selectedBuildingID:selectedBuildingID,
			selectedFloor:selectedFloor,
			selectedUserID:selectedUserID,
			currentPage:currentPage
		},
		dataType:"JSON",
		success:function(data){
			var tableString = "";
			var listData = data.list;
			totalPage = data.totalPage;
			//alert(listData);
			$.each(listData,function(i,trace){
				tableString += "<tr>"+"<td>"+trace.traceID+"</td>"; //id
				tableString += "<td>"+trace.userID+"</td>";
				tableString += "<td>"+trace.floor+"</td>";
				tableString += "<td>"+trace.x+"</td>";
				tableString += "<td>"+trace.y+"</td>";
				tableString += "<td>"+trace.time+"</td>";
				tableString += "<td>"+trace.building.buildingName+"</td>";
				
				
				tableString += "<td>"+"<a href=trace_toModifyPage.action?traceID="+
				trace.traceID+">修改</a> | "+"<a href=trace_delete.action?traceID="+ 
				trace.traceID +" onclick="+"delcfm()"+">"+"删除</a>"+"</td>"+"</tr>";
				
			})
			document.getElementById("traceTable").innerHTML=tableString;
			//分页信息
			var pageInfoString = "<b>共["+data.totalCount+"]条记录 # 共["+data.totalPage+"]页 # 第["+currentPage+"]页</b>";
			document.getElementById("page_info").innerHTML=pageInfoString;
		},
		error:function(){
			alert("拉取追踪信息失败!");
		}
	});
}

//获取用户分布信息
function getTraceDistribution(){
	var selectedBuildingID = document.getElementById("selectedBuilding").value;
	var selectedFloor = document.getElementById("selectedFloor").value;
	$.ajax({
		type:"post",
		url:"trace_getBeaconsByBuildingIDAndFloor.action",
		data:{
			selectedBuildingID:selectedBuildingID,
			selectedFloor:selectedFloor
		},
		dataType:"JSON",
		success:function(data){
			var tableString = "";
			var listData = data.list;
			totalPage = data.totalPage;
			//alert(listData);
			$.each(listData,function(i,trace){
				//在地图上标注点
				
			})
			document.getElementById("traceTable").innerHTML=tableString;
			
		},
		error:function(){
			alert("拉取追踪信息失败!");
		}
	});
}
//基站的翻页
function beacon_prePage(){
	//alert("当前页:"+currentPage);
	if(currentPage>1){
		currentPage=currentPage-1;
		getBeaconListByConditions(0);
	}
}
function beacon_nextPage(){
	if(currentPage<totalPage){
		currentPage=currentPage+1;
		getBeaconListByConditions(0);
	}
}
//目的地的翻页
function destination_prePage(){
	//alert("当前页:"+currentPage);
	if(currentPage>1){
		currentPage=currentPage-1;
		getDestinationListByConditions(0);
	}
}
function destination_nextPage(){
	if(currentPage<totalPage){
		currentPage=currentPage+1;
		getDestinationListByConditions(0);
	}
}

//室内地图的翻页
function indoorMap_prePage(){
	//alert("当前页:"+currentPage);
	if(currentPage>1){
		currentPage=currentPage-1;
		getIndoorMapListByConditions(0);
	}
}
function indoorMap_nextPage(){
	if(currentPage<totalPage){
		currentPage=currentPage+1;
		getIndoorMapListByConditions(0);
	}
}

//trace的翻页
function trace_prePage(){
	//alert("当前页:"+currentPage);
	if(currentPage>1){
		currentPage=currentPage-1;
		getTraceListByConditions(0);
	}
}
function trace_nextPage(){
	if(currentPage<totalPage){
		currentPage=currentPage+1;
		getTraceListByConditions(0);
	}
}
