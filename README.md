### Screen Pressure Test
Reading and printing out values from:

```
kotlinoverride fun dispatchTouchEvent(ev: MotionEvent): Boolean {
    ev.pressure.toString()
}
```
### Test apk
[Screen Pressure Debug Apk](https://github.com/mmaciel-disney/ScreenPressureTest/blob/master/screen_pressure_debug.apk)
