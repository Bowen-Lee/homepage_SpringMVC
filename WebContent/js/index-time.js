setInterval(function() {
  clock();
}, 1000);

function clock()
{
  var date1=new Date();  //开始时间
  var str =new Date("2013-9-22 21:35:00");
  var temp = date1-str;
  var time = new Date(temp);
  var hours = Math.floor(temp/86400000);
  var minutes = Math.floor((temp % 86400000) / 3600000);
  var seconds = Math.floor((temp % 86400000 % 3600000) / 60000);
  var sm =Math.floor((temp % 86400000 % 3600000% 60000)/1000);
  if ($('.h').text() != ((hours < 10 ? "0" : "") + hours)){
     $('.h').text((hours < 10 ? "0" : "") + hours);
     shake($('.h'));
	 $('.h');
  }
  if ($('.m').text() != ((minutes < 10 ? "0" : "") + minutes)) {
    $('.m').text((minutes < 10 ? "0" : "") + minutes);
    shake($('.m'));
	$('.m');
  }
  
  if ($('.s').text() != ((seconds < 10 ? "0" : "") + seconds)) {
    $('.s').text((seconds < 10 ? "0" : "") + seconds);
    shake($('.s'));
	$('.s');
  }
   if ($('.sm').text() != ((sm < 10 ? "0" : "") + sm)){
     $('.sm').text((sm < 10 ? "0" : "") + sm);
     shake($('.sm'));
	 $('.sm');
  }
}

$(document).load(function(){
  clock();
});

function shake(t) {
  t.addClass('shake-constant');
  setTimeout(function() {
    t.removeClass('shake-constant');
  }, 470)
}