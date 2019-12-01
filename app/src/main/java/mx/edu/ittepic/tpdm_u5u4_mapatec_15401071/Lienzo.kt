package mx.edu.ittepic.tpdm_u5u4_mapatec_15401071

import android.app.AlertDialog
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast


class Lienzo(p:MainActivity): View(p){
    var puntero = p
    var iconotec= Imagen(this, -100f, -420f, R.drawable.tec)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        iconotec.pintar(c)

        p.color= Color.BLUE
        c.drawRect(100f,2300f, 400f,2400f,p )
        p.color = Color.WHITE
        p.textSize=60f
        c.drawText("Buscar",150f,2380f ,p)
    }
    override fun onTouchEvent(e: MotionEvent): Boolean {
        when(e.action){
            MotionEvent.ACTION_DOWN -> {
                var localizacion =""
                var btnx = e.getX()
                var btny = e.getY()
                var coorbtnx =97f
                var coorbtny = 2300f
                var coorbtnx2 = 392f
                var coorbtny2 = 2400f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())
                var edificio = EditText(puntero)
                if (btnx>=coorbtnx && btnx<=coorbtnx2){
                    if (btny>=coorbtny && btny<=coorbtny2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("que edificio quieres ir UD,UVP,LICBI,CB")
                            .setView(edificio)
                            .setPositiveButton("buscar"){dialog,which->
                                localizacion =  edificio.text.toString()
                                invalidate()
                            }.setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }


                var toquex = e.getX()
                var toquey = e.getY()
                var coordeUDx = 872f
                var coordeUDy = 1856f
                var coordeUDx2 = 1896f
                var coordeUDy2 = 1941f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (toquex>=coordeUDx && toquex<=coordeUDx2){
                    if (toquey>=coordeUDy && toquey<=coordeUDy2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio UD aqui se encuentran sala de sistemas e industrial").setNegativeButton("SALIR"){
                            dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }
                var toquecbx = e.getX()
                var toquecby = e.getY()
                var coordecbx = 370f
                var coordecby = 2000f
                var coordecbx2 = 742f
                var coordecby2 = 2125f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (toquecbx>=coordecbx && toquecbx<=coordecbx2){
                    if (toquecby>=coordecby && toquecby<=coordecby2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio CB aqui se imparten las clases de Matemáticas").setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }

                var uvpx = e.getX()
                var uvpy = e.getY()
                var coorx = 1f
                var coory = 1956f
                var coorx2 = 177f
                var coory2 = 2110f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (uvpx>=coorx && uvpx<=coorx2){
                    if (uvpy>=coory && uvpy<=coory2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio UVP aqui se encuentra posgrado y vinculación, tambien se dan clases de ingles").setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }

                var licbix = e.getX()
                var licbiy = e.getY()
                var coorlx = 112f
                var coorly = 1196f
                var coorlx2 = 217f
                var coorly2 = 1371f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (licbix>=coorlx && licbix<=coorlx2){
                    if (licbiy>=coorly && licbiy<=coorly2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio LICBII aqui se encuentran los nuevos laboratorios de quimica y electrica").setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }

                var adx = e.getX()
                var ady = e.getY()
                var adax = 882f
                var aday = 1501f
                var adax2 = 982f
                var aday2 = 1571f
                puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (adx>=adax && adx<=adax2){
                    if (ady>=aday && ady<=aday2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio AD, aqui es el edificio administrativo se, y de servicios escolares").setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }
                var lcx = e.getX()
                var lcy = e.getY()
                var lbcx = 357f
                var lbcy = 1906f
                var lbcx2 = 487f
                var lbcy2 = 2015f
                        puntero.setTitle("DOWN "+e?.getX()+","+e.getY())

                if (lcx>=lbcx && lcx<=lbcx2){
                    if (lcy>=lbcy && lcy<=lbcy2){
                        var alert = AlertDialog.Builder(puntero)
                        alert.setTitle("atencion").setMessage("tocaste edificio LC, es el laboratorio de computo, aqui se la pasan los de sistemas").setNegativeButton("SALIR"){
                                dialog,which-> return@setNegativeButton
                        }.show()
                        println("hoal")
                    }
                }

            }
        }
        return true
    }
}