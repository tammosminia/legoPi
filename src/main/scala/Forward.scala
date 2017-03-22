import com.ergotech.brickpi.BrickPi
import com.ergotech.brickpi.motion.{Motor, MotorPort}

object Forward extends App {
  val brick = new BrickPi()
  val motor: Motor = new Motor
  brick.setMotor(motor, MotorPort.MA)
  //        motor.setCommandedOutput(25);
  //        for (int counter = 0; counter < 50; counter++) {
  //            try {
  //                System.out.println("Forward Motors: Speed " + brickPi.getMotor(0).getCurrentSpeed() + " encoder " + brickPi.getMotor(0).getCurrentEncoderValue() + " Time " + System.currentTimeMillis() % 10000);
  //                Thread.sleep(200);
  //            } catch (InterruptedException ex) {
  //                // ignore
  //            }
  //        }
  //        motor.setCommandedOutput(-25);
  //        for (int counter = 0; counter < 50; counter++) {
  //            try {
  //                Thread.sleep(200);
  //                System.out.println("Reverse Motors: Speed " + brickPi.getMotor(0).getCurrentSpeed() + " encoder " + brickPi.getMotor(0).getCurrentEncoderValue());
  //            } catch (InterruptedException ex) {
  //                // ignore
  //            }
  //        }
  //        motor.setCommandedOutput(0);
  //        motor.setEnabled(false);
  //        try {
  //            // get the updated values.
  //            Thread.sleep(200); // wait for the values to be read....
  //        } catch (InterruptedException ex) {
  //            Logger.getLogger(BrickPiTests.class.getName()).log(Level.SEVERE, null, ex);
  //        }
  motor.rotate(1, 50)
  Thread.sleep(1000)
}
