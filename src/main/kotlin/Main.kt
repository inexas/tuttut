import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

fun main() {
	Application.launch(Main::class.java)
}

class Main : Application() {
	override fun start(primaryStage: Stage) {
		primaryStage.title = "TutTut"

		val button = Button("Click Me")
		button.setOnAction {
			println("Button clicked!")
		}

		val root = StackPane()
		root.children.add(button)

		primaryStage.scene = Scene(root, 300.0, 200.0)
		primaryStage.show()
	}
}

