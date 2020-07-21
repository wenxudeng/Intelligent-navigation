var password_salt = "1q2w3e4r5t";

function show_loading(){
	var idx = layer.msg('', {
		icon:16,
		shape:[0.5,'#000',true],
		offset: "200px",
	    title: false,
	    closeBtn: 0,
	    time: 3*1000, // 3秒后关闭
	    shadeClose: true, // 点击其他位置关闭
	    scrollbar: false // 锁定滚动条
	});
	return idx;
	
}

