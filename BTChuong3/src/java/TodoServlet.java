
// TodoServlet.java
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TodoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<String> todoList = (List<String>) session.getAttribute("todoList");
        if (todoList == null) {
            todoList = new ArrayList<>();
        }
        String action = request.getParameter("action");
        String task = request.getParameter("task");
        if ("add".equals(action) && task != null && !task.trim().isEmpty()) {
            todoList.add(task.trim());
        } else if ("remove".equals(action) && task != null) {
            todoList.remove(task.trim());
        }
        session.setAttribute("todoList", todoList);
        response.sendRedirect("todo.jsp");
    }
}
