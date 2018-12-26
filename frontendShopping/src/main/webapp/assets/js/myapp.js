$(function(){
	// solving the active menu problem in the main page.
	switch(menu){
	case 'about': $('#about').addClass('active');
	break;
	case 'product': $('#product').addClass('active');
	break;
	case 'contact': $('#contact').addClass('active');
	break;
	default: $('#home').addClass('active');
	break;
	}
	
});