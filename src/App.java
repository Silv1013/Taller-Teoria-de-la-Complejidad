import java.util.*;
//random seed configuracion para q sea mas chevere


public class App {
    public static void main(String[] args) throws Exception {

        //el hola mundo para motivarte y no olvidar origenes

        System.out.println("Hello, World!");

        int arreglo[];  //variable para ser el nuevo arreglo generado
        int arregloAnt[];  // variable para usar el arreglo anterior como base

        Metodos ordenado = new Metodos(); // instancia de metodos

        long start, end;  //declaracion de la variable start y end


        System.out.println("-----------Metodo Insercion-----------");  //iniciar proceso con el metodo de incersion

        arreglo = new int [10];   //crear arreglo con su tamaño
        for (int i = 0; i < arreglo.length; i ++){  //bucle for para ir llenando de valores el arreglo
            arreglo[i] = new Random().nextInt(1000);  // metodo para generar numeros randoms en un enlaze de hasta el numero 1000
        
        }
        System.out.println("");
        start = System.nanoTime();   //empieza a medir el tiempo
        ordenado.insercionPrimero(arreglo);     //tipo de metodo a usar 
        end = System.nanoTime();     //deja de medir el tiempo
        //ordenado.imprimirArreglo(arreglo);
        System.out.println("");
        System.out.println("Con 10 valores el tiempo es de " + (end - start)*0.000000001+ " segs ");  //Linea de codigo q lanza el tiempo demorado ya en segs
       

       arregloAnt = arreglo.clone();   //se define a la variable arregloAnt con el valor del arreglo anterior usando el .clone
       arreglo = new int[20];   //crea el arreglo con el tamaño
       for(int i = 0 ; i < arregloAnt.length; i++){  //bucle for para llenar los espacios del nuevo arreglo con los datos del arreglo anterior
        arreglo[i] = arregloAnt[i];
           }
        for(int i = arregloAnt.length; i < arreglo.length; i++){  //bucle for para llenar de datos randoms los espacios sobrantes del arreglo
            arreglo[i] = new Random().nextInt(1000);    //metodo para generar numeros randoms
            
        }
        System.out.println("");
        start = System.nanoTime(); //empieza a medir el tiempo
        ordenado.insercionPrimero(arreglo);   //metodo a utilizar
        end = System.nanoTime();  // deja de medir el tiempo
        //ordenado.imprimirArreglo(arreglo);
        System.out.println("");
        System.out.println("Con 20 valores el tiempo es de "+ (end - start)*0.000000001 + "segs");//Linea de codigo q lanza el tiempo demorado ya en segs


        


        arregloAnt = arreglo.clone();
        arreglo = new int[100];
        for(int i = 0 ; i < arregloAnt.length; i++){
         arreglo[i] = arregloAnt[i];
            }
         for(int i = arregloAnt.length; i < arreglo.length; i++){
             arreglo[i] = new Random().nextInt(1000);
             
         }
         System.out.println("");
         start = System.nanoTime();
         ordenado.insercionPrimero(arreglo);
         end = System.nanoTime();
        // ordenado.imprimirArreglo(arreglo);
         System.out.println("");

         System.out.println("Con 100 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");


         arregloAnt = arreglo.clone();
         arreglo = new int[1000];
         for(int i = 0 ; i < arregloAnt.length; i++){
          arreglo[i] = arregloAnt[i];
             }
          for(int i = arregloAnt.length; i < arreglo.length; i++){
              arreglo[i] = new Random().nextInt(1000);
              
          }
          System.out.println("");
          start = System.nanoTime();
          ordenado.insercionPrimero(arreglo);
          end = System.nanoTime();
          //ordenado.imprimirArreglo(arreglo);
          System.out.println("");
 
          System.out.println("Con 1000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");


          arregloAnt = arreglo.clone();
          arreglo = new int[5000];
          for(int i = 0 ; i < arregloAnt.length; i++){
           arreglo[i] = arregloAnt[i];
              }
           for(int i = arregloAnt.length; i < arreglo.length; i++){
               arreglo[i] = new Random().nextInt(1000);
               
           }
           System.out.println("");
           start = System.nanoTime();
           ordenado.insercionPrimero(arreglo);
           end = System.nanoTime();
           //ordenado.imprimirArreglo(arreglo);
           System.out.println("");
  
           System.out.println("Con 5000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");


           arregloAnt = arreglo.clone();
           arreglo = new int[10000];
           for(int i = 0 ; i < arregloAnt.length; i++){
            arreglo[i] = arregloAnt[i];
               }
            for(int i = arregloAnt.length; i < arreglo.length; i++){
                arreglo[i] = new Random().nextInt(1000);
                
            }
            System.out.println("");
            start = System.nanoTime();
            ordenado.insercionPrimero(arreglo);
            end = System.nanoTime();
            //ordenado.imprimirArreglo(arreglo);
            System.out.println("");
   
            System.out.println("Con 10000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");


            arregloAnt = arreglo.clone();
            arreglo = new int[30000];
            for(int i = 0 ; i < arregloAnt.length; i++){
             arreglo[i] = arregloAnt[i];
                }
             for(int i = arregloAnt.length; i < arreglo.length; i++){
                 arreglo[i] = new Random().nextInt(1000);
                 
             }
             System.out.println("");
             start = System.nanoTime();
             ordenado.insercionPrimero(arreglo);
             end = System.nanoTime();
             //ordenado.imprimirArreglo(arreglo);
             System.out.println("");
    
             System.out.println("Con 30000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");



             System.out.println("");


             System.out.println("-----------Metodo Seleccion-----------");

             arreglo = new int [10];
             for (int i = 0; i < arreglo.length; i ++){
                 arreglo[i] = new Random().nextInt(1000);
             
             }
             System.out.println("");
             start = System.nanoTime();   
             ordenado.seleccionPrimero(arreglo);  
             end = System.nanoTime();
            // ordenado.imprimirArreglo(arreglo);
             System.out.println("");
             System.out.println("Con 10 valores el tiempo es de " + (end - start)*0.000000001+ " segs ");
            
     
            arregloAnt = arreglo.clone();
            arreglo = new int[20];
            for(int i = 0 ; i < arregloAnt.length; i++){
             arreglo[i] = arregloAnt[i];
                }
             for(int i = arregloAnt.length; i < arreglo.length; i++){
                 arreglo[i] = new Random().nextInt(1000);
                 
             }
             System.out.println("");
             start = System.nanoTime();
             ordenado.seleccionPrimero(arreglo);
             end = System.nanoTime();
            // ordenado.imprimirArreglo(arreglo);
             System.out.println("");
             System.out.println("Con 20 valores el tiempo es de "+ (end - start)*0.000000001 + "segs");
     
     
             
     
     
             arregloAnt = arreglo.clone();
             arreglo = new int[100];
             for(int i = 0 ; i < arregloAnt.length; i++){
              arreglo[i] = arregloAnt[i];
                 }
              for(int i = arregloAnt.length; i < arreglo.length; i++){
                  arreglo[i] = new Random().nextInt(1000);
                  
              }
              System.out.println("");
              start = System.nanoTime();
              ordenado.seleccionPrimero(arreglo);
              end = System.nanoTime();
             // ordenado.imprimirArreglo(arreglo);
              System.out.println("");
     
              System.out.println("Con 100 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
     
     
              arregloAnt = arreglo.clone();
              arreglo = new int[1000];
              for(int i = 0 ; i < arregloAnt.length; i++){
               arreglo[i] = arregloAnt[i];
                  }
               for(int i = arregloAnt.length; i < arreglo.length; i++){
                   arreglo[i] = new Random().nextInt(1000);
                   
               }
               System.out.println("");
               start = System.nanoTime();
               ordenado.seleccionPrimero(arreglo);
               end = System.nanoTime();
               //ordenado.imprimirArreglo(arreglo);
               System.out.println("");
      
               System.out.println("Con 1000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
     
     
               arregloAnt = arreglo.clone();
               arreglo = new int[5000];
               for(int i = 0 ; i < arregloAnt.length; i++){
                arreglo[i] = arregloAnt[i];
                   }
                for(int i = arregloAnt.length; i < arreglo.length; i++){
                    arreglo[i] = new Random().nextInt(1000);
                    
                }
                System.out.println("");
                start = System.nanoTime();
                ordenado.seleccionPrimero(arreglo);
                end = System.nanoTime();
                //ordenado.imprimirArreglo(arreglo);
                System.out.println("");
       
                System.out.println("Con 5000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
     
     
                arregloAnt = arreglo.clone();
                arreglo = new int[10000];
                for(int i = 0 ; i < arregloAnt.length; i++){
                 arreglo[i] = arregloAnt[i];
                    }
                 for(int i = arregloAnt.length; i < arreglo.length; i++){
                     arreglo[i] = new Random().nextInt(1000);
                     
                 }
                 System.out.println("");
                 start = System.nanoTime();
                 ordenado.seleccionPrimero(arreglo);
                 end = System.nanoTime();
                 //ordenado.imprimirArreglo(arreglo);
                 System.out.println("");
        
                 System.out.println("Con 10000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
     
     
                 arregloAnt = arreglo.clone();
                 arreglo = new int[30000];
                 for(int i = 0 ; i < arregloAnt.length; i++){
                  arreglo[i] = arregloAnt[i];
                     }
                  for(int i = arregloAnt.length; i < arreglo.length; i++){
                      arreglo[i] = new Random().nextInt(1000);
                      
                  }
                  System.out.println("");
                  start = System.nanoTime();
                  ordenado.seleccionPrimero(arreglo);
                  end = System.nanoTime();
                  //ordenado.imprimirArreglo(arreglo);
                  System.out.println("");
         
                  System.out.println("Con 30000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");


                  System.out.println("-----------Metodo Burbuja Mejorado-----------");

                  arreglo = new int [10];
                  for (int i = 0; i < arreglo.length; i ++){
                      arreglo[i] = new Random().nextInt(1000);
                  
                  }
                  System.out.println("");
                  start = System.nanoTime();   
                  ordenado.burbujaMejorado(arreglo);  
                  end = System.nanoTime();
                 // ordenado.imprimirArreglo(arreglo);
                  System.out.println("");
                  System.out.println("Con 10 valores el tiempo es de " + (end - start)*0.000000001+ " segs ");
                 
          
                 arregloAnt = arreglo.clone();
                 arreglo = new int[20];
                 for(int i = 0 ; i < arregloAnt.length; i++){
                  arreglo[i] = arregloAnt[i];
                     }
                  for(int i = arregloAnt.length; i < arreglo.length; i++){
                      arreglo[i] = new Random().nextInt(1000);
                      
                  }
                  System.out.println("");
                  start = System.nanoTime();
                  ordenado.burbujaMejorado(arreglo);
                  end = System.nanoTime();
                 // ordenado.imprimirArreglo(arreglo);
                  System.out.println("");
                  System.out.println("Con 20 valores el tiempo es de "+ (end - start)*0.000000001 + "segs");
          
          
                  
          
          
                  arregloAnt = arreglo.clone();
                  arreglo = new int[100];
                  for(int i = 0 ; i < arregloAnt.length; i++){
                   arreglo[i] = arregloAnt[i];
                      }
                   for(int i = arregloAnt.length; i < arreglo.length; i++){
                       arreglo[i] = new Random().nextInt(1000);
                       
                   }
                   System.out.println("");
                   start = System.nanoTime();
                   ordenado.burbujaMejorado(arreglo);
                   end = System.nanoTime();
                  // ordenado.imprimirArreglo(arreglo);
                   System.out.println("");
          
                   System.out.println("Con 100 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
          
          
                   arregloAnt = arreglo.clone();
                   arreglo = new int[1000];
                   for(int i = 0 ; i < arregloAnt.length; i++){
                    arreglo[i] = arregloAnt[i];
                       }
                    for(int i = arregloAnt.length; i < arreglo.length; i++){
                        arreglo[i] = new Random().nextInt(1000);
                        
                    }
                    System.out.println("");
                    start = System.nanoTime();
                    ordenado.burbujaMejorado(arreglo);
                    end = System.nanoTime();
                    //ordenado.imprimirArreglo(arreglo);
                    System.out.println("");
           
                    System.out.println("Con 1000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
          
          
                    arregloAnt = arreglo.clone();
                    arreglo = new int[5000];
                    for(int i = 0 ; i < arregloAnt.length; i++){
                     arreglo[i] = arregloAnt[i];
                        }
                     for(int i = arregloAnt.length; i < arreglo.length; i++){
                         arreglo[i] = new Random().nextInt(1000);
                         
                     }
                     System.out.println("");
                     start = System.nanoTime();
                     ordenado.burbujaMejorado(arreglo);
                     end = System.nanoTime();
                     //ordenado.imprimirArreglo(arreglo);
                     System.out.println("");
            
                     System.out.println("Con 5000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
          
          
                     arregloAnt = arreglo.clone();
                     arreglo = new int[10000];
                     for(int i = 0 ; i < arregloAnt.length; i++){
                      arreglo[i] = arregloAnt[i];
                         }
                      for(int i = arregloAnt.length; i < arreglo.length; i++){
                          arreglo[i] = new Random().nextInt(1000);
                          
                      }
                      System.out.println("");
                      start = System.nanoTime();
                      ordenado.burbujaMejorado(arreglo);
                      end = System.nanoTime();
                      //ordenado.imprimirArreglo(arreglo);
                      System.out.println("");
             
                      System.out.println("Con 10000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");
          
          
                      arregloAnt = arreglo.clone();
                      arreglo = new int[30000];
                      for(int i = 0 ; i < arregloAnt.length; i++){
                       arreglo[i] = arregloAnt[i];
                          }
                       for(int i = arregloAnt.length; i < arreglo.length; i++){
                           arreglo[i] = new Random().nextInt(1000);
                           
                       }
                       System.out.println("");
                       start = System.nanoTime();
                       ordenado.burbujaMejorado(arreglo);
                       end = System.nanoTime();
                       //ordenado.imprimirArreglo(arreglo);
                       System.out.println("");
              
                       System.out.println("Con 30000 valores el tiempo es de "+ (end - start)*0.000000001 + " segs");



        
        //Scanner leer = new Scanner(System.in);
        
        //Random rand = new Random();
        
       /*  while (true){
            System.out.println("Menu /n Escoja una opcion: ");
            System.out.println("1. Generar arreglos aleatorios con diferentes tamaño:");
            System.out.println("2. Ordenar por los 3 metodos: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                int[] tamano = {10, 20, 100, 1000, 5000, 10000, 30000};
                
                
                
                break;
                
                case 2:
                
                
               // for 
                //ejecutarTiempo(tamano, rand);
                break;


            }
        }*/



        
    }
}
