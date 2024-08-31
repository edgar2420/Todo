#include <DHT.h>//ambiente
#include <DHT_U.h>//ambiente
#define DHTPIN 2//conexion ambiente
#define DHTTYPE DHT11//tipo de sensor
DHT dht(DHTPIN, DHTTYPE);//ambiente
int lectura = 0;//luz A0
int luzval;//luz
int mac1 = A1;//conexion maceta
int mac2 = A2;//conexion maceta
int mac3 = A3;//conexion maceta
int mac4 = A4;//conexion maceta
int mac1val, mac2val, mac3val, mac4val;
void setup() {
  pinMode(7, OUTPUT);
  digitalWrite(7, HIGH);
  pinMode(6, OUTPUT);
  digitalWrite(6, HIGH);
  Serial.begin(9600);
  dht.begin();//ambiente
}
void loop() {
  delay(500);
  float h = dht.readHumidity();//ambiente
  //
  int hval = int(h);
  //
  float t = dht.readTemperature();//ambiente
  //
  int tval = int(t);
  //
  float hic = dht.computeHeatIndex(t, h, false);//ambiente
  int hicval = int(hic);
  //Ambiente
  //Serial.print("Humedad: ");//ambiente
  Serial.print(hval);
  Serial.print(",");
  //Serial.print(" Temperatura: ");
  Serial.print(tval);//ambiente
  Serial.print(",");//ambiente
  //Serial.print(" Índice de calor: ");
  Serial.print(hicval);//ambiente
  Serial.print(",");
  //Dia-Noche
  //Serial.print("Luz: ");
  lectura = analogRead(0);//luz
  luzval = analogRead(A0); //luz
  luzval = map(luzval, 0, 1024, 0, 100); //luz
  Serial.print(luzval);//luz
  Serial.print(",");
  //Macetas
  //Serial.print("Macetas: ");

  
    mac1val = analogRead(mac1);//tierra
    mac2val = analogRead(mac2);//tierra
    mac3val = analogRead(mac3);//tierra
    mac4val = analogRead(mac4);//tierra

  /*mac1val = 100;//tierra
  mac2val = 200;//tierra
  mac3val = 300;//tierra
  mac4val = 400;//tierra*/

  Serial.print(mac1val);
  Serial.print(",");
  Serial.print(mac2val);
  Serial.print(",");
  Serial.print(mac3val);
  Serial.print(",");
  Serial.print(mac4val);
  Serial.print('\n');
  delay(250);
}
