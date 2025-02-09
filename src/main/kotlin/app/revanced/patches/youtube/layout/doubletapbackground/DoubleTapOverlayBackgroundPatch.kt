package app.revanced.patches.youtube.layout.doubletapbackground

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.shared.patch.overlaybackground.AbstractOverlayBackgroundPatch
import app.revanced.patches.youtube.utils.settings.SettingsPatch

@Patch(
    name = "Hide double tap overlay filter",
    description = "Hides the double tap dark filter layer.",
    dependencies = [SettingsPatch::class],
    compatiblePackages = [
        CompatiblePackage(
            "com.google.android.youtube",
            [
                "18.25.40",
                "18.27.36",
                "18.29.38",
                "18.30.37",
                "18.31.40",
                "18.32.39",
                "18.33.40",
                "18.34.38",
                "18.35.36",
                "18.36.39",
                "18.37.36",
                "18.38.44",
                "18.39.41",
                "18.40.34",
                "18.41.39",
                "18.42.41",
                "18.43.45",
                "18.44.41",
                "18.45.43"
            ]
        )
    ],
    use = false
)
@Suppress("unused")
object DoubleTapOverlayBackgroundPatch : AbstractOverlayBackgroundPatch(
    arrayOf("quick_seek_overlay.xml"),
    arrayOf("tap_bloom_view", "dark_background")
) {
    override fun execute(context: ResourceContext) {
        super.execute(context)

        SettingsPatch.updatePatchStatus("Hide double tap overlay filter")

    }
}