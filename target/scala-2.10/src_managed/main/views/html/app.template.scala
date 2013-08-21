
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
/**/
object app extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css">
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.35*/routes/*13.41*/.Assets.at("css/style.css"))),format.raw/*13.68*/("""">

</head>

<body>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Project name</a>
        <div class="nav-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

<div class="container">
    <div id="tweedli_container" class="span6 text-center pagination-center"></div>


</div><!-- /.container -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/js/bootstrap.min.js"></script>
<script data-main='/assets/js/main' src='"""),_display_(Seq[Any](/*44.43*/routes/*44.49*/.Assets.at("js/lib/require/require-min.js"))),format.raw/*44.92*/("""'></script>
</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 15 15:57:57 CEST 2013
                    SOURCE: C:/Users/Csaba/Documents/GitHub/tweedli/app/views/app.scala.html
                    HASH: 3645cbc20e519317579cae7ec2aad4dbf053ab67
                    MATRIX: 567->0|1055->452|1070->458|1119->485|2260->1590|2275->1596|2340->1639
                    LINES: 22->1|34->13|34->13|34->13|65->44|65->44|65->44
                    -- GENERATED --
                */
            