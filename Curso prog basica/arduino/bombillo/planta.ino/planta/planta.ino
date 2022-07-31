#define SENSOR 2

byte v_sensor = 1;
 int luz = 10;
  int secuencia = 500;
void setup(){
 Serial.begin(9600);
 pinMode ( luz, OUTPUT);
 pinMode ( SENSOR, INPUT);
}

void loop() {
 v_sensor = digitalRead(SENSOR);

 if(v_sensor == 0){
  Serial.println("No me riegues todavia");
 }
 else{

  Serial.println("Riegame ya");
  digitalWrite(luz, HIGH);
  delay(secuencia);
  digitalWrite(luz, LOW);
  delay(secuencia);
 }
}
