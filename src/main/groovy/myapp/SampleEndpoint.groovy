package myapp

import org.springframework.boot.actuate.endpoint.Endpoint
import org.springframework.stereotype.Component

@Component
class SampleEndpoint implements Endpoint<Void> {


	@Override
	String getId() {
		"sample"
	}

	@Override
	boolean isEnabled() {
		return true
	}

	@Override
	boolean isSensitive() {
		return false
	}

	@Override
	Void invoke() {
		throw new RuntimeException("sample!")
	}
}
