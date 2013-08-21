
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import org.bson.types.ObjectId
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tweedli - stack up your tweets with class</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href='"""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*10.59*/("""' rel="stylesheet">
    <link href='"""),_display_(Seq[Any](/*11.18*/routes/*11.24*/.Assets.at("css/bootstrap-responsive.min.css"))),format.raw/*11.70*/("""' rel="stylesheet">
    <link href='"""),_display_(Seq[Any](/*12.18*/routes/*12.24*/.Assets.at("css/style.css"))),format.raw/*12.51*/("""' rel="stylesheet">
    <link href='"""),_display_(Seq[Any](/*13.18*/routes/*13.24*/.Assets.at("css/bootstrap-lightbox.min.css"))),format.raw/*13.68*/("""' rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Quicksand:300,400,700' rel='stylesheet' type='text/css'>
    <link rel="image_src" href="thumbnail.png" />
    <link rel="icon" type="image/ico" href="favicon.ico">
</head>
<body data-spy="scroll" data-target=".navbar">
<div id="stuff"></div>
<div id="home">
    <div class="container">
        <div class="row">
            <div class="span6 margin15 visible-phone">
                <img src='"""),_display_(Seq[Any](/*24.28*/routes/*24.34*/.Assets.at("img/logo.png"))),format.raw/*24.60*/("""' alt="">
                <h1 class="margin5">Stack up your tweets with class</h1>
                <a class="button btn btn-large margin5" href="/authenticate/twitter"><img src='"""),_display_(Seq[Any](/*26.97*/routes/*26.103*/.Assets.at("img/arrow_down.png"))),format.raw/*26.135*/("""' alt=""> Sign in with Twitter</a>
            </div>
            <div class="span6">
                <img src='"""),_display_(Seq[Any](/*29.28*/routes/*29.34*/.Assets.at("img/iphone.png"))),format.raw/*29.62*/("""' alt="">
            </div>
            <div class="span6 margin15 hidden-phone">
                <img src='"""),_display_(Seq[Any](/*32.28*/routes/*32.34*/.Assets.at("img/logo.png"))),format.raw/*32.60*/("""' alt="">
                <h1 class="margin5">Stack up your tweets with class</h1>
                <a class="button btn btn-large margin5" href="/authenticate/twitter"><img src='"""),_display_(Seq[Any](/*34.97*/routes/*34.103*/.Assets.at("img/arrow_down.png"))),format.raw/*34.135*/("""' alt=""> Sign in with Twitter</a>
            </div>
        </div>
    </div>
</div>
<!-- break -->
<div id="features">
    <div class="navbar" id="navbar_feat">
        <div class="container separator">
            <div class="navbar-inner">
                <ul class="nav">
                    <li class="active"><a href="#navbar_feat">Features</a></li>
                    <li class="divider-vertical"></li>
                    <li><a href="#navbar_about">About</a></li>
                    <li class="divider-vertical"></li>
                    <li><a href="#terms">Terms</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row" id="feat1">
            <div class="span6 margin5 margin-5">
                <img src='"""),_display_(Seq[Any](/*57.28*/routes/*57.34*/.Assets.at("img/features_1.jpg"))),format.raw/*57.66*/("""' alt="">
            </div>
            <div class="span6 margin10">
                <h2>Information<span><br> that you need</span></h2>
                <p>Aoccdrnig to a rscheearch at Cmabrigde Uinervtisy, it deosn't mttaer in waht oredr the ltteers in a wrod are,
                    the olny iprmoetnt tihng is taht the frist and lsat ltteer be at the rghit pclae.<br>
                    The rset can be a toatl mses and you can sitll raed it wouthit porbelm.
                    Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe. Awesomeness, true story!</p>
                <a href="#home"><img src='"""),_display_(Seq[Any](/*65.44*/routes/*65.50*/.Assets.at("img/back.png"))),format.raw/*65.76*/("""' alt="" class="margin5"></a>
                <a href="#feat2"><img src='"""),_display_(Seq[Any](/*66.45*/routes/*66.51*/.Assets.at("img/more.png"))),format.raw/*66.77*/("""' alt="" class="margin5"></a>
            </div>
        </div>
        <div class="separator"></div>
        <div class="row" id="feat2">
            <div class="span6 margin10">
                <h2><span>Anytime</span><br> anystyle</h2>
                <p>Aoccdrnig to a rscheearch at Cmabrigde Uinervtisy, it deosn't mttaer in waht oredr the ltteers in a wrod are,
                    the olny iprmoetnt tihng is taht the frist and lsat ltteer be at the rghit pclae.<br>
                    The rset can be a toatl mses and you can sitll raed it wouthit porbelm.
                    Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe. Awesomeness, true story!</p>
                <a href="#home"><img src='"""),_display_(Seq[Any](/*77.44*/routes/*77.50*/.Assets.at("img/back.png"))),format.raw/*77.76*/("""' alt="" class="margin5"></a>
                <a href="#gallery"><img src='"""),_display_(Seq[Any](/*78.47*/routes/*78.53*/.Assets.at("img/more.png"))),format.raw/*78.79*/("""' alt="" class="margin5"></a>
            </div>
            <div class="span6 margin5 margin-5">
                <img src='"""),_display_(Seq[Any](/*81.28*/routes/*81.34*/.Assets.at("img/features_2.jpg"))),format.raw/*81.66*/("""' alt="">
            </div>
        </div>
        <div class="separator"></div>
        <div class="row" id="gallery">
            <div class="span12 margin5 margin-5">
                <h2><span>Shots</span></h2>
                <ul class="thumbnails margin5">
                    <li class="span3">
                        <a data-toggle="lightbox" href="#shot1" class="thumbnail">
                            <img src='"""),_display_(Seq[Any](/*91.40*/routes/*91.46*/.Assets.at("img/gallery/shot1.png"))),format.raw/*91.81*/("""' alt="">
                        </a>
                    </li>
                    <li class="span3">
                        <a data-toggle="lightbox" href="#shot2" class="thumbnail">
                            <img src='"""),_display_(Seq[Any](/*96.40*/routes/*96.46*/.Assets.at("img/gallery/shot2.png"))),format.raw/*96.81*/("""' alt="">
                        </a>
                    </li>
                    <li class="span3">
                        <a data-toggle="lightbox" href="#shot3" class="thumbnail">
                            <img src='"""),_display_(Seq[Any](/*101.40*/routes/*101.46*/.Assets.at("img/gallery/shot3.png"))),format.raw/*101.81*/("""' alt="">
                        </a>
                    </li>
                    <li class="span3">
                        <a data-toggle="lightbox" href="#shot4" class="thumbnail">
                            <img src='"""),_display_(Seq[Any](/*106.40*/routes/*106.46*/.Assets.at("img/gallery/shot4.png"))),format.raw/*106.81*/("""' alt="">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div id="shot1" class="lightbox hide fade"  tabindex="-1" role="dialog" aria-hidden="true">
            <div class='lightbox-content'>
                <img src='"""),_display_(Seq[Any](/*114.28*/routes/*114.34*/.Assets.at("img/gallery/shot1@@2x.png"))),format.raw/*114.73*/("""' alt="">
            </div>
        </div>
        <div id="shot2" class="lightbox hide fade"  tabindex="-1" role="dialog" aria-hidden="true">
            <div class='lightbox-content'>
                <img src='"""),_display_(Seq[Any](/*119.28*/routes/*119.34*/.Assets.at("img/gallery/shot2@@2x.png"))),format.raw/*119.73*/("""' alt="">
            </div>
        </div>
        <div id="shot3" class="lightbox hide fade"  tabindex="-1" role="dialog" aria-hidden="true">
            <div class='lightbox-content'>
                <img src='"""),_display_(Seq[Any](/*124.28*/routes/*124.34*/.Assets.at("img/gallery/shot3@@2x.png"))),format.raw/*124.73*/("""' alt="">
            </div>
        </div>
        <div id="shot4" class="lightbox hide fade"  tabindex="-1" role="dialog" aria-hidden="true">
            <div class='lightbox-content'>
                <img src='"""),_display_(Seq[Any](/*129.28*/routes/*129.34*/.Assets.at("img/gallery/shot4@@2x.png"))),format.raw/*129.73*/("""' alt="">
            </div>
        </div>
    </div>
</div>
<!-- break -->
<div id="about">
    <div class="navbar" id="navbar_about">
        <div class="container separator">
            <div class="navbar-inner">
                <ul class="nav">
                    <li class="active"><a href="#navbar_feat">Features</a></li>
                    <li class="divider-vertical"></li>
                    <li><a href="#navbar_about">About</a></li>
                    <li class="divider-vertical"></li>
                    <li><a href="#terms">Terms</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="span4 margin5 margin-5">
                <h2><span>Team</span></h2>
                <img src='"""),_display_(Seq[Any](/*153.28*/routes/*153.34*/.Assets.at("img/team.png"))),format.raw/*153.60*/("""' alt="">
                <p>Aoccdrnig to a rscheearch at Cmabrigde Uinervtisy, it deosn't mttaer in waht oredr the ltteers in a wrod are,
                    the olny iprmoetnt tihng is taht the frist and lsat ltteer be at the rghit pclae.</p>
            </div>
            <div class="span4 margin5 margin-5">
                <h2><span>Idea</span></h2>
                <img src='"""),_display_(Seq[Any](/*159.28*/routes/*159.34*/.Assets.at("img/idea.png"))),format.raw/*159.60*/("""' alt="">
                <p>The rset can be a toatl mses and you can sitll raed it wouthit porbelm.
                    Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe. Awesomeness, true story!</p>
            </div>
            <div class="span4 margin5 margin-5">
                <h2><span>Contact</span></h2>
                <div id="map_canvas"></div>
                <p><strong>Awesomeapp, Inc.</strong><br>
                    795 Folsom St., Suite 600<br>
                    San Francisco, CA 94107<br>
                    <abbr title="Phone">P:</abbr> (123) 456-7890
                </p>
            </div>
        </div>
    </div>
</div>
<div id="terms">
    <div class="container">
        <div class="row">
            <div class="span6 offset3 margin15 margin-15">
                <p>read<a href="#termsofservice" data-toggle="modal"> terms of service</a> / <a href="#privacypolicy" data-toggle="modal">privacy policy</a></p>
                <!--start terms of service popup-->
                <div id="termsofservice" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="termsModalLabel" aria-hidden="true">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
                        <h3 id="termsModalLabel">Terms of Service</h3>
                    </div>
                    <div class="modal-body">
                        <p>The following terms and conditions govern your use of this web site,
                            and any content made available from or through the following Envato Marketplaces web sites.</p>
                        <p>Your terms of service text...</p>
                        <p>Any questions about this Privacy Policy should be addressed to support@example.com</p>
                    </div>
                    <button class="btn margin-5" data-dismiss="modal" aria-hidden="true">Close</button>
                </div>
                <!--end terms of service popup-->
                <!--start privacy policy popup-->
                <div id="privacypolicy" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="privacyModalLabel" aria-hidden="true">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
                        <h3 id="privacyModalLabel">Privacy Policy</h3>
                    </div>
                    <div class="modal-body">
                        <p>Application creator may periodically update this policy.
                            We will notify you about significant changes in the way we treat personal information by sending a notice to the
                            primary email address specified in your primary account holder account or by placing a prominent notice on our site.</p>
                        <p>Your privacy policy text...</p>
                        <p>Any questions about this Privacy Policy should be addressed to support@example.com</p>
                    </div>
                    <button  type="button" class="btn margin-5" data-dismiss="modal" aria-hidden="true">Close</button>
                </div>
                <!--end privacy policy popup-->
                <h1>Like it?</h1>
                <a class="button btn btn-large margin5" href="http://themeforest.net/item/superawesome-retina-bootstrap-app-landing-page/3597882?ref=awerest"><img src='"""),_display_(Seq[Any](/*212.170*/routes/*212.176*/.Assets.at("img/arrow_down.png"))),format.raw/*212.208*/("""' alt=""> Download the app</a>
            </div>
        </div>
    </div>
</div>
<!-- break -->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="span4 margin5 margin-5">
                <span>"Stay in touch and have a nice app!"</span>
            </div>
            <div class="span4 margin5 margin-5">
                <img src='"""),_display_(Seq[Any](/*225.28*/routes/*225.34*/.Assets.at("img/logo_footer.png"))),format.raw/*225.67*/("""' alt="">
            </div>
            <div class="span4 margin5 margin-5">
                <a class="button btn" href="http://www.facebook.com/awerest" target="_blank"><img src='"""),_display_(Seq[Any](/*228.105*/routes/*228.111*/.Assets.at("img/social/facebook_icon.png"))),format.raw/*228.153*/("""' alt=""></a>
                <a class="button btn" href="http://twitter.com/awerest" target="_blank"><img src='"""),_display_(Seq[Any](/*229.100*/routes/*229.106*/.Assets.at("img/social/twitter_icon.png"))),format.raw/*229.147*/("""' alt=""></a>
                <a class="button btn" href="http://instagram.com/awerest/" target="_blank"><img src='"""),_display_(Seq[Any](/*230.103*/routes/*230.109*/.Assets.at("img/social/instagram_icon.png"))),format.raw/*230.152*/("""' alt=""></a>
                <a class="button btn" href="http://pinterest.com/awerest/" target="_blank"><img src='"""),_display_(Seq[Any](/*231.103*/routes/*231.109*/.Assets.at("img/social/pinterest_icon.png"))),format.raw/*231.152*/("""' alt=""></a>
                <a class="button btn" href="mailto:someone@example.com" target="_blank"><img src='"""),_display_(Seq[Any](/*232.101*/routes/*232.107*/.Assets.at("img/social/mail_icon.png"))),format.raw/*232.145*/("""' alt=""></a>
            </div>
        </div>
    </div>
</div>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src='"""),_display_(Seq[Any](/*238.15*/routes/*238.21*/.Assets.at("js/bootstrap.min.js"))),format.raw/*238.54*/("""'></script>
<!-- script src='"""),_display_(Seq[Any](/*239.19*/routes/*239.25*/.Assets.at("js/retina.js"))),format.raw/*239.51*/("""'></script -->
<script src='"""),_display_(Seq[Any](/*240.15*/routes/*240.21*/.Assets.at("js/jquery.backstretch.min.js"))),format.raw/*240.63*/("""'></script>
<script src='"""),_display_(Seq[Any](/*241.15*/routes/*241.21*/.Assets.at("js/bootstrap-lightbox.min.js"))),format.raw/*241.63*/("""'></script>
<script src='"""),_display_(Seq[Any](/*242.15*/routes/*242.21*/.Assets.at("js/custom.js"))),format.raw/*242.47*/("""'></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript">
    var settingsItemsMap = """),format.raw/*245.28*/("""{"""),format.raw/*245.29*/("""
    zoom: 13,
    center: new google.maps.LatLng(37.782163,-122.400591),
    panControl: false,
    zoomControl: true,
    zoomControlOptions: """),format.raw/*250.25*/("""{"""),format.raw/*250.26*/("""
    style: google.maps.ZoomControlStyle.SMALL
    """),format.raw/*252.5*/("""}"""),format.raw/*252.6*/(""",
    mapTypeControl: false,
    scaleControl: false,
    streetViewControl: false,
    overviewMapControl: false,
    mapTypeId: google.maps.MapTypeId.ROADMAP
    """),format.raw/*258.5*/("""}"""),format.raw/*258.6*/(""";
    var map = new google.maps.Map(document.getElementById('map_canvas'), settingsItemsMap );

    var myMarker = new google.maps.Marker("""),format.raw/*261.43*/("""{"""),format.raw/*261.44*/("""
    position: new google.maps.LatLng(37.782163,-122.400591),
    draggable: false
    """),format.raw/*264.5*/("""}"""),format.raw/*264.6*/(""");

    map.setCenter(myMarker.position);
    myMarker.setMap(map);
</script>
<script type="text/javascript">
    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', 'YOUR GOOGLE ANALYTICS CODE']);
    _gaq.push(['_trackPageview']);

    (function() """),format.raw/*274.17*/("""{"""),format.raw/*274.18*/("""
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
    """),format.raw/*278.5*/("""}"""),format.raw/*278.6*/(""")();
</script>


</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 15 08:57:42 CEST 2013
                    SOURCE: C:/Users/Csaba/Documents/GitHub/tweedli/app/views/main.scala.html
                    HASH: 7845f4624b3c12e19600de4b345642a940be1c41
                    MATRIX: 540->1|647->31|964->312|979->318|1036->353|1110->391|1125->397|1193->443|1267->481|1282->487|1331->514|1405->552|1420->558|1486->602|2003->1083|2018->1089|2066->1115|2283->1296|2299->1302|2354->1334|2506->1450|2521->1456|2571->1484|2720->1597|2735->1603|2783->1629|3000->1810|3016->1816|3071->1848|3925->2666|3940->2672|3994->2704|4689->3363|4704->3369|4752->3395|4863->3470|4878->3476|4926->3502|5725->4265|5740->4271|5788->4297|5901->4374|5916->4380|5964->4406|6128->4534|6143->4540|6197->4572|6667->5006|6682->5012|6739->5047|7006->5278|7021->5284|7078->5319|7346->5550|7362->5556|7420->5591|7688->5822|7704->5828|7762->5863|8098->6162|8114->6168|8176->6207|8432->6426|8448->6432|8510->6471|8766->6690|8782->6696|8844->6735|9100->6954|9116->6960|9178->6999|10039->7823|10055->7829|10104->7855|10530->8244|10546->8250|10595->8276|14237->11882|14254->11888|14310->11920|14743->12316|14759->12322|14815->12355|15038->12540|15055->12546|15121->12588|15273->12702|15290->12708|15355->12749|15510->12866|15527->12872|15594->12915|15749->13032|15766->13038|15833->13081|15985->13196|16002->13202|16064->13240|16251->13390|16267->13396|16323->13429|16391->13460|16407->13466|16456->13492|16523->13522|16539->13528|16604->13570|16668->13597|16684->13603|16749->13645|16813->13672|16829->13678|16878->13704|17075->13872|17105->13873|17283->14022|17313->14023|17394->14076|17423->14077|17621->14247|17650->14248|17820->14389|17850->14390|17968->14480|17997->14481|18287->14742|18317->14743|18655->15053|18684->15054
                    LINES: 20->1|23->1|32->10|32->10|32->10|33->11|33->11|33->11|34->12|34->12|34->12|35->13|35->13|35->13|46->24|46->24|46->24|48->26|48->26|48->26|51->29|51->29|51->29|54->32|54->32|54->32|56->34|56->34|56->34|79->57|79->57|79->57|87->65|87->65|87->65|88->66|88->66|88->66|99->77|99->77|99->77|100->78|100->78|100->78|103->81|103->81|103->81|113->91|113->91|113->91|118->96|118->96|118->96|123->101|123->101|123->101|128->106|128->106|128->106|136->114|136->114|136->114|141->119|141->119|141->119|146->124|146->124|146->124|151->129|151->129|151->129|175->153|175->153|175->153|181->159|181->159|181->159|234->212|234->212|234->212|247->225|247->225|247->225|250->228|250->228|250->228|251->229|251->229|251->229|252->230|252->230|252->230|253->231|253->231|253->231|254->232|254->232|254->232|260->238|260->238|260->238|261->239|261->239|261->239|262->240|262->240|262->240|263->241|263->241|263->241|264->242|264->242|264->242|267->245|267->245|272->250|272->250|274->252|274->252|280->258|280->258|283->261|283->261|286->264|286->264|296->274|296->274|300->278|300->278
                    -- GENERATED --
                */
            