package evaluation;

public class EvaluationDTO {

		int evaluationID;
		String userID;
		String lectureName;
		String professorName;
		int lectureYear;
		String semesterDivide;
		String lectureDivide;
		String evaluationTitle;
		String evaluationContent;
		String lecturePower;
		String lectureDifficult;
		String lectureAssignment;
		int likeCount;
		
		
		public int getEvaluationID() {
			return evaluationID;
		}
		public void setEvaluationID(int evaluationID) {
			this.evaluationID = evaluationID;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getLectureName() {
			return lectureName;
		}
		public void setLectureName(String lectureName) {
			this.lectureName = lectureName;
		}
		public String getProfessorName() {
			return professorName;
		}
		public void setProfessorName(String professorName) {
			this.professorName = professorName;
		}
		public int getLectureYear() {
			return lectureYear;
		}
		public void setLectureYear(int lectureYear) {
			this.lectureYear = lectureYear;
		}
		public String getSemesterDivide() {
			return semesterDivide;
		}
		public void setSemesterDivide(String semesterDivide) {
			this.semesterDivide = semesterDivide;
		}
		public String getLectureDivide() {
			return lectureDivide;
		}
		public void setLectureDivide(String lectureDivide) {
			this.lectureDivide = lectureDivide;
		}
		public String getEvaluationTitle() {
			return evaluationTitle;
		}
		public void setEvaluationTitle(String evaluationTitle) {
			this.evaluationTitle = evaluationTitle;
		}
		public String getEvaluationContent() {
			return evaluationContent;
		}
		public void setEvaluationContent(String evaluationContent) {
			this.evaluationContent = evaluationContent;
		}
		public String getLecturePower() {
			return lecturePower;
		}
		public void setLecturePower(String lecturePower) {
			this.lecturePower = lecturePower;
		}
		public String getLectureDifficult() {
			return lectureDifficult;
		}
		public void setLectureDifficult(String lectureDifficult) {
			this.lectureDifficult = lectureDifficult;
		}
		public String getLectureAssignment() {
			return lectureAssignment;
		}
		public void setLectureAssignment(String lectureAssignment) {
			this.lectureAssignment = lectureAssignment;
		}
		public int getLikeCount() {
			return likeCount;
		}
		public void setLikeCount(int likeCount) {
			this.likeCount = likeCount;
		}
		
		public EvaluationDTO(){
			
			
			
			
		}
		
		
		public EvaluationDTO(int evaluationID, String userID, String lectureName, String professorName, int lectureYear,
				String semesterDivide, String lectureDivide, String evaluationTitle, String evaluationContent,
				String lecturePower, String lectureDifficult, String lectureAssignment, int likeCount) {
			super();
			this.evaluationID = evaluationID;
			this.userID = userID;
			this.lectureName = lectureName;
			this.professorName = professorName;
			this.lectureYear = lectureYear;
			this.semesterDivide = semesterDivide;
			this.lectureDivide = lectureDivide;
			this.evaluationTitle = evaluationTitle;
			this.evaluationContent = evaluationContent;
			this.lecturePower = lecturePower;
			this.lectureDifficult = lectureDifficult;
			this.lectureAssignment = lectureAssignment;
			this.likeCount = likeCount;
		}
		
		
		
	
	
}
