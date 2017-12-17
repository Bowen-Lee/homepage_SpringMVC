
<!DOCTYPE HTML><html><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1">
<title>天马行空</title>
<!-- 基础背景 -->
<link rel="stylesheet" type="text/css" href="css/search-form.css">
<!--当前Time跳动显示-->
<link rel='stylesheet prefetch'  href="css/csshake.min.css">
<style>
a.two:link {
    color: #0c1631;
}
</style>
</head>
<body>
	<div style="width:1200px;">
		<div class="timealagin">
			<div class='clock' style="width:1200px;">
				<div class='h shake shake-slow' ></div>
				<div class="shake" style="background:none;color:white"><font face="myFont"size="7">天 </font></div>
				<div class='m shake shake-slow'></div>
				<div class="shake" style="background:none;color:white"><font face="myFont"size="7">时</font></div>
				<div class='s shake shake-slow'></div>
				<div class="shake" style="background:none;color:white"><font face="myFont"size="7">分</font></div>
				<div class='sm shake shake-slow'></div>
				<div class="shake" style="background:none;color:white"><font face="myFont"size="7">秒</font></div>
			</div>
		</div>
	</div>
	</div>
	<form onsubmit="submitFn(this, event);">
		<div class="search-wrapper" style="top:50%;z-index:3;left:50%;">			
			<div class="input-holder">
				<input type="text" class="search-input" placeholder="Type to search" autocomplete="off"/>
				<button class="search-icon" onclick="searchToggle(this, event);"><span></span></button>
			</div>
			<span class="close" onclick="searchToggle(this, event);"></span>
			<div class="result-container">

			</div>
		</div>
	</form>
	
	<div class="search-wrapper" style="top:70%;z-index:3;left:50%;">			
			<!--<div class = "fanyi1">
				 <input type="text" placeholder="Electronic dictionary" id="fanyi">
				<button type="submit" onclick ="fanYi()"></button>
			</div>-->
			<div style="text-align:center;top:95%; font:normal 14px/24px 'MicroSoft YaHei';">
				<p id= "author">author：Bowen</p>
			</div>
	</div>
	
	<!--<iframe src="http://shanghai.tianqi.com/index.php?c=code&id=8&num=7" width="500px" height="300px"  scrolling="no" frameborder="0"></iframe>-->
	<div class="chaolianjie">
		  <p><b><a class="two" href="https://www.csdn.net/" target="_blank">CSND</a></b></p>
		  <p><b><a class="two" href="http://fanyi.baidu.com/?aldtype=16047#auto/zh" target="_blank">翻译</a></b></p>
		  <p><b><a class="two" href="https://github.com/" target="_blank">git</a></b></p>
		  <p><b><a class="two" href="http://www.runoob.com/" target="_blank">runoob</a></b></p>
		  <p><b><a class="two" href="http://www.imooc.com/" target="_blank">慕课</a></b></p>
		  <p><b><a class="two" href="https://bwh1.net/clientarea.php" target="_blank">clientarea</a></b></p>
		  <p><b><a class="two" href="https://exmail.qq.com/cgi-bin/loginpage?" target="_blank">email</a></b></p>
		  <p><b><a class="two" href="https://docs.oracle.com/javaee/7/api/" target="_blank">EE 7</a></b></p>
		  <p><b><a class="two" href="http://www.w3school.com.cn/sql/sql_quiz.asp" target="_blank">W3S</a></b></p>
		  <p><b><a class="two" href="https://www.cnblogs.com/" target="_blank">cnblogs</a></b></p>
		  <p><b><a class="two" href="http://tool.oschina.net/apidocs" target="_blank">apidocs</a></b></p>
		  <p><b><a class="two" href="http://www.redis.net.cn/" target="_blank">redis</a></b></p>
		  <input type="file" id="f" onchange="getFilePath(this.files[0])" style="filter:alpha(opacity=0);opacity:0;width: 0;height: 0;"/> 
		</div>
	<div>
		
		
	</div>
	<script src="../js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../js/jquery-1.7.2-time.js"></script>
	<script type="text/javascript" src="../js/index-time.js"></script>
	<!--/当前Time跳动显示-->
</body>
</html>
