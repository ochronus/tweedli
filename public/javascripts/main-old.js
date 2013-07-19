$(document).ready(function() {
 
//==================== Tabs ========================//

        //When page loads...
        $(".tab_content").hide(); //Hide all content
        $("ul.tabs li:first").addClass("active").show(); //Activate first tab
        $(".tab_content:first").show(); //Show first tab content
 
        //On Click Event
        $("ul.tabs li").click(function() {
 
                $("ul.tabs li").removeClass("active"); //Remove any "active" class
                $(this).addClass("active"); //Add "active" class to selected tab
                $(".tab_content").hide(); //Hide all tab content
 
                var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
                $(activeTab).fadeIn(); //Fade in the active ID content
                return false;
        });

//==================== Topbar ========================//

	$(".topbar-btn").click(function(){
	  $(".topbar").slideToggle("slow");
	  $(this).toggleClass("active");
	});

//==================== Flickrfeed ========================//

	$('#flickr').jflickrfeed({
	limit: 8,
	qstrings: {
		id: '52617155@N08'
	},
	itemTemplate: '<li><a href="{{image_b}}"><img src="{{image_s}}" alt="{{title}}" /></a></li>'
	});

//==================== Prettyphoto ========================//

    $("a[rel^='prettyPhoto']").prettyPhoto({theme:'pp_default'});

//==================== hoverzoom ========================//

$('.es-carousel ul li a').hover(function(){
    $(this).find('img').stop().fadeTo('fast',0.4);
}, 
function(){
    $(this).find('img').stop().fadeTo('fast',1);

});
//==================== carousel ========================//

		$('#carousel').elastislide({
		imageW 	: 220,
		minItems	: 4
		});

//==================== Responsiveslide ========================//

	      $("#slider3").responsiveSlides({
	      auto: true,
	      pager: false,
	      nav: true,
		speed: 1000,
		namespace: "callbacks",
		before: function () {
		$('.events').append("<li>before event fired.</li>");
		},
		after: function () {
		$('.events').append("<li>after event fired.</li>");
		}
		});


});

