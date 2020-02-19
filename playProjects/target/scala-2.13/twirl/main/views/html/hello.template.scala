
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*creating the Hello World Page
*
* The @ sign tells the template engine to interpret what follows.
* @main("Hello") calls the main template, main.scala.html and
*passes it the page title of Hello.
*The content section contains the Hello World greeting.
*The main template will insert this into the body of the page.
*The aside section adds the TOC to the right side so that you will
*e able to navigate back to this page.
*
*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*14.2*/main("Hello")/*14.15*/ {_display_(Seq[Any](format.raw/*14.17*/("""

"""),format.raw/*16.1*/("""<section id="content">

    <div class="wrapper doc">

        <article>
            <h1>Hello World</h1>
        </article>

        <aside>
            """),_display_(/*25.14*/commonSidebar()),format.raw/*25.29*/("""
        """),format.raw/*26.9*/("""</aside>

    </div>

</section>

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
                  DATE: 2020-01-18T13:16:00.786379
                  SOURCE: /home/trevor/Desktop/playProjects/app/views/hello.scala.html
                  HASH: 12c64265b15a82209be7c083099cd821e15223f1
                  MATRIX: 1235->431|1257->444|1297->446|1326->448|1508->603|1544->618|1580->627
                  LINES: 36->14|36->14|36->14|38->16|47->25|47->25|48->26
                  -- GENERATED --
              */
          