package spd.models.Task;

import java.util.Comparator;

public class TaskWitiComparator implements Comparator<TaskWitiModel> {
	public int compare(TaskWitiModel firstTask, TaskWitiModel secondTask) {
		if (firstTask.getExecutionTime() != secondTask.getExecutionTime()) {
			return firstTask.getExecutionTime() - secondTask.getExecutionTime();
		}
		else {
			return firstTask.getIndex() - secondTask.getIndex();
		}
	//	return Math.max(0, firstTask.getExecutionTime() - firstTask.getDeadlineTime()) * firstTask.getWeight() - Math.max(0, secondTask.getExecutionTime() - secondTask.getDeadlineTime()) * secondTask.getWeight();
	}
}
