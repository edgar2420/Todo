import processing.serial.*;
//-----
int val1, val2, val3, val4, hum, temp, ic, luz;

Serial myPort;
//-----
//cuadricula de pocisiones
int a = 1080/20; //25
int b = 720/20;
PImage imgFondo;
PImage botonV[] = new PImage[4]; //arreglo de imagenes para los botones
String imFile[]={"botonV.png", "DiaHumedo.jpeg", "Noche.png"}; //ruta de las imagenes

  int btnPX = 360; //variable de posición X del primer botón
  int btnPz = 220; //variable de posicion X del segundo botón
  int btnPy = 570; //variable de posicion X del tercer botón
  int btnPi = 630; //variable de posicion X del cuarto botón 
void setup() {
  size(1080, 720);
  myPort = new Serial(this, Serial.list()[1], 9600);
}

void draw() {
  
  //obtenemos fecha y hora act.
  int day=day(), month=month(), year=year(), hour=hour(), minute=minute(), second=second();
  String date = day+ "/"+month+"/"+year+"||"+hour+":"+minute+":"+second ;
  if(hour < 18){
    imgFondo = loadImage("DiaHumedo.jpeg");
  image(imgFondo, 0, 0, width, height);
  } else{
    imgFondo = loadImage("Noche.png");
    image(imgFondo, 0, 0, width, height);
  }
  
  //cargar imagenes
  
  for (int i = 0; i < 4; i++) {
    botonV[i]=loadImage(imFile[0]);
  }
  for ( int u =0; u<10; u+=10) {
    line(0, u, 0  , u);
    line(u, 0, u, 720);
  }
  //-----Tipo de Fuente
  PFont font;
  font= createFont("Arial", 22);
  textFont(font);
  
  
  //-----
  
  //colocamos las macetas y los botones
  //variable de la posicion X de la tercera maceta
  
  for (int a = 0; a < 4; a++) {
    //Lugar para los botones
    image(botonV[a], btnPX, 300, 70, 70);
    image(botonV[a], btnPz, 538, 70, 70);
    image(botonV[a], btnPy, 400, 70, 70);
    image(botonV[a], btnPi, 640, 70, 70);
    //Lugar para las macetas
   // image(Macetaxd[a], macPz, 200, 200, 150); //1
    //image(Macetaxd[a], macPy, 200, 200, 150); //2    
    //image(Macetaxd[a], macPx, 400, 200, 150); //3
    //image(Macetaxd[a], macPi, 400, 200, 150); //4
  }
  fill(0,0,0);
  text("Santa Cruz", 300,50);
  text(date, 415, 50);
  text(val1,350,600);
  text(val2,690,480);
  text(val3,580,700);
  text(val4,475,375);
  text("Humedad:", 840, 150);
  text(hum,990,150);
  text("Temperatura:", 840, 250);
  text(temp,990,250);
  text("Indice Calor", 840, 350);
  text(ic,990,350);
  text("Dia o Noche", 840, 450);
  text(luz,990,450);
}
void serialEvent(Serial myPort) {
    String inString = myPort.readStringUntil('\n');
    if (inString != null) {
      inString = trim(inString);
      int[] serial_val = int(split(inString, ","));
      if (serial_val.length >= 8) {
        hum = serial_val[0];
        temp = serial_val[1];
        ic = serial_val[2];
        luz = serial_val[3];
        val1 = serial_val[4];
        val2 = serial_val[5];
        val3 = serial_val[6];
        val4 = serial_val[7];
    }     
  }
}
