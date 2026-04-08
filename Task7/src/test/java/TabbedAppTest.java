
import org.example.TabbedApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

class TabbedAppTest {
    private TabbedApp app;
    private JFrame frame;

    @BeforeEach
    void setUp() {
        TabbedApp.main(new String[]{});
        for (Window window : Window.getWindows()) {
            if (window instanceof JFrame) {
                frame = (JFrame) window;
                break;
            }
        }
    }
    @Test
    void testTabContent() {
        JTabbedPane tabbedPane = (JTabbedPane) frame.getContentPane().getComponent(0);
        assertEquals(5,tabbedPane.getTabCount(),"Should have 5 tabs");
    }
    @Test
    void testTabTitle() {
        JTabbedPane tabbedPane = (JTabbedPane) frame.getContentPane().getComponent(0);
        assertEquals("Home",tabbedPane.getTitleAt(0));
        assertEquals("Settings",tabbedPane.getTitleAt(2));
    }

}


