package framework.ftc.cobaltforge;

/**
 * Sensor Types deprecated in favor of @Inject
 * Created by Dummyc0m on 9/22/16.
 */
@Deprecated
@SuppressWarnings("WeakerAccess")
public enum SensorType {
    LEGACY_MODULE,
    TOUCH_SENSOR_MULTIPLEXER,
    DEVICE_INTERFACE_MODULE,
    ANALOG_INPUT,
    DIGITAL_CHANNEL,
    OPTICAL_DISTANCE_SENSOR,
    TOUCH_SENSOR,
    PWM_OUTPUT,
    I2C_DEVICE,
    ANALOG_OUTPUT,
    COLOR_SENSOR,
    LED,
    ACCELERATION_SENSOR,
    COMPASS_SENSOR,
    GYRO_SENSOR,
    IR_SEEKER_SENSOR,
    LIGHT_SENSOR,
    ULTRASONIC_SENSOR,
    VOLTAGE_SENSOR
}