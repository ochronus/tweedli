
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""


"""),_display_(Seq[Any](/*4.2*/main("Welcome to Play 2.1")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""
   Hello """),_display_(Seq[Any](/*5.11*/message)),format.raw/*5.18*/("""<br/><br/>
   <a href='/authenticate/twitter'>Login</a><br/><a href='/logout'>Logout</a>
    
""")))})),format.raw/*8.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 15 08:57:42 CEST 2013
                    SOURCE: C:/Users/Csaba/Documents/GitHub/tweedli/app/views/index.scala.html
                    HASH: 045070ccb4980ef0fece9ca027d50682ec41d034
                    MATRIX: 536->1|630->18|671->25|706->52|745->54|792->66|820->73|948->171
                    LINES: 20->1|23->1|26->4|26->4|26->4|27->5|27->5|30->8
                    -- GENERATED --
                */
            