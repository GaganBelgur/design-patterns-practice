package src.main.java.com.gaganbelgur

import com.gaganbelgur.gadgets.Desktop
import com.gaganbelgur.gadgets.ElectronicGadgets
import com.gaganbelgur.gadgets.FitnessWatch
import com.gaganbelgur.gadgets.Laptop
import com.gaganbelgur.gadgets.SmartWatch

sealed class GadgetType {

    abstract fun create(): ElectronicGadgets

    object LaptopType: GadgetType() {
        override fun create(): ElectronicGadgets = Laptop()
    }
    object DesktopType: GadgetType() {
        override fun create(): ElectronicGadgets = Desktop()
    }
    object FitnessWatchType: GadgetType() {
        override fun create(): ElectronicGadgets = FitnessWatch()
    }
    object SmartWatchType: GadgetType() {
        override fun create(): ElectronicGadgets = SmartWatch()
    }
}