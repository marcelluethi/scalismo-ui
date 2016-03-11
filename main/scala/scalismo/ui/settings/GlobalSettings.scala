package scalismo.ui.settings

object GlobalSettingsFile extends SettingsFile(SettingsDirectory.get().get, "global.ini")

object GlobalSettings extends PersistentSettings(GlobalSettingsFile) {

  /**
   * Setting Keys used by the UI itself.
   */
  object Keys {
    val HighDpiScale = "common.highdpi.scale"
    val WindowHeight = "common.windowHeight"
    val WindowWidth = "common.windowWidth"
    val WindowMaximized = "common.windowMaximized"
    val PerspectiveName = "common.perspective"
    val SlicesVisible = "common.slices.visible"
    val IntersectionsVisible = "common.slices.intersections.visible"
    val SlicesOpacity = "common.slices.opacity"
    val LastUsedDirectories = "common.lastUsedDirectories"
    //    final val ImageWindowLevelWindow = "common.image.windowlevel.Window"
    //    final val ImageWindowLevelLevel = "common.image.windowlevel.Level"
    //    final val TwoDClickSnapThreshold = "common.2dclick.snapthreshold"
    //    final val TwoDClickHighlight = "common.2dclick.highlight"
  }

}
