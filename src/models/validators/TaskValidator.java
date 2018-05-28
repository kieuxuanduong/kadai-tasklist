package models.validators;

import models.Task;

public class TaskValidator {
	public static String validate(Task t) {
		String content_error = _validateContent(t.getContent());
		if (!content_error.equals("")) {
			return content_error;
		}
		return content_error;
	}
	private static String _validateContent(String content) {
		if (content == null || content.equals("")) {
			return("タスク内容を入力してください！");
		}
		return "";
	}
}
