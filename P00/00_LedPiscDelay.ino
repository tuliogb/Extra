void setup() {
  pinMode(10, OUTPUT);
  //Porta + Sentido da corrente de dados.
}

void loop() {

  digitalWrite(10, HIGH);     // Porta 10 em alta por um tempo de 1s
  delay(1000);    

  digitalWrite(10, LOW);      // Porta 10 em baixa por um tempo de 1s
  delay(1000);
}
