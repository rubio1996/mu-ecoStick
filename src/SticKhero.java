import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SticKhero extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        /* CREACIÓN DE LA VENTANA Y DE LOS CONTENEDORES PRINCIPALES */
        
        // Contenedor principal donde se alojarán todos los elementos
        Group root = new Group();  
        // Creación de una zona de dibujo (canvas) de 200 x 150 puntos
        Canvas canvas = new Canvas(500, 500);
        // Obtención del contexto gráfico del canvas anterior que permitirá
        //  realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Se añade el canvas al contenedor principal (root)
        root.getChildren().add(canvas);
        // Creación del área (scene) correspondiente al contenido que tendrá la 
        //  ventana, de 600 x 400 puntos, con color gris claro, indicando que el
        //  elemento root va a ser el contenedor principal de este espacio
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);
        // Se asocia la ventana (scene) al parámetro primaryStage (escenario
        //  principal). El parámetro primaryStage se recibe en este método start
        primaryStage.setScene(scene);
        // Título que se aparecerá en la ventana
        primaryStage.setTitle("dibujando el muñeco STICK HERO");
        // Orden para que se muestre la ventana        
        primaryStage.show();
        //creacion de la base del muñeco
        gc.fillRoundRect(50, 20, 80, 140, 30, 30);
        //creacion de una pata
        gc.fillRoundRect(55, 20, 20, 180, 30, 30);
        //creacion de la segunda pata
        gc.fillRoundRect(105, 20, 20, 180, 30, 30);
        //CREACION DE OJO
        gc.setFill(Color.web("#FFFFFF"));
        gc.fillOval(90, 30, 25, 25);
       //CREACION DE PUPILA
       gc.setFill(Color.web("#000000"));
       gc.fillOval(95, 40, 10, 10);
        //creacion de banda de la cabeza
        gc.setFill(Color.web("#51FE00"));
        gc.fillRoundRect(50, 28, 80, 15, 0, 0);
        //Creacion de triangulos de la banda
        Polygon polygon = new Polygon();
        polygon.setFill(Color.web("#51FE00"));
        root.getChildren().add(polygon);
        polygon.getPoints().addAll(new Double[]{
            0.0, 55.0,
            55.0, 30.0,
            10.0, 20.0 });
        Polygon polygon1 = new Polygon();
        polygon.setFill(Color.web("#51FE00"));
        root.getChildren().add(polygon1);
        polygon.getPoints().addAll(new Double[]{
            0.0, 40.0,
            60.0, 30.0,
            50.0, 20.0 });
        //creacion de la base del pantalon del muñeco
        gc.setFill(Color.web("#FFF700"));
        gc.fillRoundRect(50, 100, 80, 60, 0, 0);
        //creacion de una pata del pantalon
        gc.setFill(Color.web("#FFF700"));
        gc.fillRoundRect(50, 100, 25, 90, 0, 0);
        //creacion de la segunda pata del muñeco
        gc.setFill(Color.web("#FFF700"));
        gc.fillRoundRect(100, 100, 30, 90, 0, 0);
        //creacion de banda del cinturon
        gc.setFill(Color.web("#51FE00"));
        gc.fillRoundRect(50, 100, 80, 15, 0, 0);
        //creacion
        gc.setFill(Color.web("#AD5100"));
        gc.fillRoundRect(80, 100, 20, 15, 0, 0);
        
    } 
        
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }}
    

