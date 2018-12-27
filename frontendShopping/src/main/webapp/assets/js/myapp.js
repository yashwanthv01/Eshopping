$(function(){
	// solving the active menu problem in the main page.
	switch(menu){
	case 'about': $('#about').addClass('active');
	break;
	case 'productsList': $('#productsList').addClass('active');
	break;
	case 'contact': $('#contact').addClass('active');
	break;
	case 'productsList': $('#productsList').addClass('active');
	break;
	default: $('#home').addClass('active');
	$('#a_'+menu).addClass('active');
	break;
	}
	
});