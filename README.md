### Screen Pressure Test
Reading and printing out values from:

```
kotlinoverride fun dispatchTouchEvent(ev: MotionEvent): Boolean {
    ev.pressure.toString()
}
```
