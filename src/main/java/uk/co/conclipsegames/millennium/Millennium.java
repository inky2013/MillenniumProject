package uk.co.conclipsegames.millennium;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import uk.co.conclipsegames.millennium.proxy.CommonProxy;

/**
 * Created by Ethan Brews on 18/06/2017.
 */
@Mod(modid = Millennium.MODID, version = Millennium.VERSION, name = Millennium.NAME)
public class Millennium {
    public static final String MODID = "millennium";
    public static final String VERSION = "Alpha 1.0";
    public static final String NAME = "Millennium Project";
    public final Logger logger;

    public Millennium() {
        this.logger = FMLLog.getLogger();
    }

    @SidedProxy(clientSide = "uk.co.conclipsegames.millennium.proxy.ClientProxy", serverSide = "uk.co.conclipsegames.millennium.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}
