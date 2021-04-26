package actions;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.net.URLEncoder;
import java.util.Date;
import java.util.Objects;


public class TwitAction extends AnAction {
    /**
     * Пример плагина. Когда выделяем текст в коде и жмем горячие клавиши открывается яндекс и ищет это
     * Комбинация клавиш "command + \" или "ctrl + \". Это все прописано в файле plugin.xml.
     * Кода мы экстендим класс от AnAction можно навести на выделение нашего класса и задать экшн и горячие клавиши
     * @param event
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {

        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        assert editor != null;
        String selectedText = editor.getSelectionModel().getSelectedText();
        Messages.showMessageDialog(selectedText, "Zagolovok",Messages.getInformationIcon());
        BrowserUtil.browse("https://yandex.ru/search/?lr=213&text=" + selectedText);
        System.out.println("ok");
    }

    @Override
    public boolean isDumbAware() {
        return false;
    }
}
