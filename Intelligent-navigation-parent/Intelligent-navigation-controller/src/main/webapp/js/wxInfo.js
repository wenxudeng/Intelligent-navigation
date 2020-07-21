//获取OpenID
var openID;

function getOpenID(){
	window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb4ae5bac19ddf07c&redirect_uri=https%3A%2F%2Fwww.cleverguided.com%2FiLaN%2Fwxtoken_getOpenID.action&response_type=code&scope=snsapi_base&state=register#wechat_redirect";
}

function checkIn(){
	window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb4ae5bac19ddf07c&redirect_uri=https%3A%2F%2Fwww.cleverguided.com%2FiLaN%2Fwxtoken_getOpenIdForCheckin.action&response_type=code&scope=snsapi_base&state=checkin#wechat_redirect";
}