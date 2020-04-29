<div class="sidebar">
  <!--
    Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red"
-->
  <div class="sidebar-wrapper" id="sidebar-div">
    <div class="logo">
      <a href="javascript:void(0)" class="simple-text logo-mini">
<!--             CT -->
      </a>
      <a href="javascript:void(0)" class="simple-text logo-normal">
        PPCWIZ
      </a>
    </div>
    <ul class="nav" id="main-sidebar">
      <li class="js-li-control">
        <a href="/dashboard">
          <i class="tim-icons icon-chart-pie-36"></i>
          <p>Dashboard</p>
        </a>
      </li>
      <li class="js-li-control">
        <a href="/user_info">
          <i class="tim-icons icon-single-02"></i>
          <p>User Profile</p>
        </a>
      </li>
      <li class="js-li-control">
        <a href="/">
          <i class="tim-icons icon-puzzle-10"></i>
          <p>Table List</p>
        </a>
      </li>
      <li class="js-li-control">
        <a href="/opt_in">
          <i class="tim-icons icon-basket-simple"></i>
          <p>OPT-IN</p>
        </a>
      </li>
    </ul>
  </div>
</div>
<script>
var $sidebarContainer = $('#sidebar-div');
$('.js-li-control',$sidebarContainer).on('click',function(){
	$('.js-li-control').each(function(i,e){
		if($(e).hasClass('active')){
			$(e).removeClass('active')
		}
	});
	$(this).addClass('active')
})
</script>