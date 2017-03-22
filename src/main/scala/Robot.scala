import com.ergotech.brickpi.BrickPi
import com.ergotech.brickpi.motion.{Motor, MotorPort}

object Robot {
  val maxSpeed = 250 //maximaal 255?
  println("Robot setup")
  val brickPi = new BrickPi()
  val motora = new Motor
  brickPi.setMotor(motora, MotorPort.MA)
  val motord = new Motor
  brickPi.setMotor(motord, MotorPort.MD)
  motora.setEnabled(true)
  motord.setEnabled(true)
  motora.setDirection(Motor.Direction.COUNTER_CLOCKWISE)
  motord.setDirection(Motor.Direction.COUNTER_CLOCKWISE)
  try
    brickPi.setupSensors
  catch {
    case ex => println(ex)
  }

  def setMotors(speedA: Int, speedD: Int): Unit = {
    motora.setCommandedOutput(speedA)
    motord.setCommandedOutput(speedD)
  }
  def forward(speed: Int = 150): Unit = setMotors(speed, speed)
  def forward: Unit = forward()
  def backward(speed: Int = 150): Unit = forward(-speed)
  def backward: Unit = backward()
  def stop(): Unit = forward(0)
  def left(speed: Int = 50): Unit = setMotors(speed, -speed)
  def left: Unit = left()
  def right(speed: Int = 50): Unit = setMotors(-speed, speed)
  def right: Unit = right()

  println("Robot setup done")
}
