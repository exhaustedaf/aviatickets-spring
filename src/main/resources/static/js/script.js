$(document).ready(function () {
  $('#horizontalTab').easyResponsiveTabs({
    type: 'default', //Types: default, vertical, accordion
    width: 'auto', //auto or any width like 600px
    fit: true   // 100% fit in a container
  });
});

$('.value-plus').on('click', function(){
  var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)+1;
  divUpd.text(newVal);
});

$('.value-minus').on('click', function(){
  var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)-1;
  if(newVal>=1) divUpd.text(newVal);
});

$(function() {
    $( "#datepicker,#datepicker1,#datepicker2" ).datepicker();
});
