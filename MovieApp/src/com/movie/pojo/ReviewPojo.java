package com.movie.pojo;

public class ReviewPojo {
private String rate;
private String comments;
public ReviewPojo(String rate, String comments) {
	super();
	this.rate = rate;
	this.comments = comments;
}
public ReviewPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Review [rate=" + rate + ", comments=" + comments + "]";
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}

}
