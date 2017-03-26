package $package$.components

import sri.navigation._
import sri.vector.icons.{MaterialIcons, MaterialIconsList}

import scala.scalajs.js.annotation.{JSExportStatic, ScalaJSDefined}

@ScalaJSDefined
class DraftsScreen extends NavigationScreenComponentNoPS {

  def render() = MyNavScreen("Drafts Screen")
}

object DraftsScreen {
  @JSExportStatic
  val navigationOptions = NavigationScreenOptions[DraftsScreen](
    drawer = DrawerConfig(label = "Drafts", icon = (options: IconOptions) => {
      MaterialIcons(name = MaterialIconsList.DRAFTS,
                    size = 24,
                    color = options.tintColor)
    })
  )
}
