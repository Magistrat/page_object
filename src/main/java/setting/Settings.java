package setting;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    // Определяем параметр запуска
    public static final String PLATFORM_DRIVER = "docker";
    public static final String PORTAINER_COMMAND_EXECUTOR = "https://portainer.keyauto.ru/dev/selenoid/backend/wd/hub";
    public static final String[] OPTIONS  = new String[] {
            "disable-in-process-stack-traces",
            "disable-crash-reporter",
            "--log-level=OFF",
            "no-sandbox",
            "disable-logging",
            "disable-dev-shm-usage",
            "--start-maximized"
    };
    public static final Map<String, String> MOBILE_EMULATION = new HashMap<>(){
        {
            put("deviceName", "iPhone X");
        }
    };

    public static final String[] ENABLE_AUTOMATION = new String[] {"enable-automation"};

    public static final long IMPLICITLY_TIMEOUT = 0;
    public static final float EXPLICITLY_TIMEOUT = 40.0f;
    public static final float POLL_FREQUENCY = 0.1f;



}
