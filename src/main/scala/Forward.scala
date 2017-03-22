import com.ergotech.brickpi.BrickPi
import com.ergotech.brickpi.motion.{Motor, MotorPort}
import com.ergotech.brickpi.sensors.{Sensor, SensorPort, SensorType, TouchSensor}

object Forward extends App {
  println("forwards!")
  Robot.forward()
  Thread.sleep(10000)

  println("achteruit!")
  Robot.backward()
  Thread.sleep(10000)

  Robot.stop
  println("dat was het")
}
