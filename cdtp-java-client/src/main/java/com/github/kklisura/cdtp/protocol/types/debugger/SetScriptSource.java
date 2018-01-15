package com.github.kklisura.cdtp.protocol.types.debugger;

import java.util.List;
import com.github.kklisura.cdtp.protocol.annotations.Optional;
import com.github.kklisura.cdtp.protocol.types.runtime.StackTrace;
import com.github.kklisura.cdtp.protocol.types.runtime.StackTraceId;
import com.github.kklisura.cdtp.protocol.annotations.Experimental;
import com.github.kklisura.cdtp.protocol.types.runtime.ExceptionDetails;

public class SetScriptSource {

	@Optional
	private List<CallFrame> callFrames;

	@Optional
	private Boolean stackChanged;

	@Optional
	private StackTrace asyncStackTrace;

	@Experimental
	@Optional
	private StackTraceId asyncStackTraceId;

	@Optional
	private ExceptionDetails exceptionDetails;

	/**
	 * New stack trace in case editing has happened while VM was stopped.
	 */
	public List<CallFrame> getCallFrames() {
		return callFrames;
	}

	/**
	 * New stack trace in case editing has happened while VM was stopped.
	 */
	public void setCallFrames(List<CallFrame> callFrames) {
		this.callFrames = callFrames;
	}

	/**
	 * Whether current call stack  was modified after applying the changes.
	 */
	public Boolean getStackChanged() {
		return stackChanged;
	}

	/**
	 * Whether current call stack  was modified after applying the changes.
	 */
	public void setStackChanged(Boolean stackChanged) {
		this.stackChanged = stackChanged;
	}

	/**
	 * Async stack trace, if any.
	 */
	public StackTrace getAsyncStackTrace() {
		return asyncStackTrace;
	}

	/**
	 * Async stack trace, if any.
	 */
	public void setAsyncStackTrace(StackTrace asyncStackTrace) {
		this.asyncStackTrace = asyncStackTrace;
	}

	/**
	 * Async stack trace, if any.
	 */
	public StackTraceId getAsyncStackTraceId() {
		return asyncStackTraceId;
	}

	/**
	 * Async stack trace, if any.
	 */
	public void setAsyncStackTraceId(StackTraceId asyncStackTraceId) {
		this.asyncStackTraceId = asyncStackTraceId;
	}

	/**
	 * Exception details if any.
	 */
	public ExceptionDetails getExceptionDetails() {
		return exceptionDetails;
	}

	/**
	 * Exception details if any.
	 */
	public void setExceptionDetails(ExceptionDetails exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}
}