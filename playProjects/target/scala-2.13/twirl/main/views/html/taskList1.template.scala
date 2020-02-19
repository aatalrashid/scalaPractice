
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object taskList1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main(tasks: Seq[String])),format.raw/*2.26*/("""

"""),_display_(/*4.2*/main("Task List")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
"""),format.raw/*5.1*/("""<h2>Task List</h2>

<ul>
    """),_display_(/*8.6*/for(task <- tasks) yield /*8.24*/ {_display_(Seq[Any](format.raw/*8.26*/("""
    """),format.raw/*9.5*/("""<li>"""),_display_(/*9.10*/task),format.raw/*9.14*/("""</li>
    """)))}),format.raw/*10.6*/("""
"""),format.raw/*11.1*/("""</ul>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-21T20:34:58.105879
                  SOURCE: /home/trevor/Desktop/playProjects/app/views/taskList1.scala.html
                  HASH: 5192178f2394b8a7fe0dce193649ae26cdfa8fb9
                  MATRIX: 815->2|859->26|887->29|912->46|951->48|978->49|1033->79|1066->97|1105->99|1136->104|1167->109|1191->113|1232->124|1260->125
                  LINES: 26->2|26->2|28->4|28->4|28->4|29->5|32->8|32->8|32->8|33->9|33->9|33->9|34->10|35->11
                  -- GENERATED --
              */
          