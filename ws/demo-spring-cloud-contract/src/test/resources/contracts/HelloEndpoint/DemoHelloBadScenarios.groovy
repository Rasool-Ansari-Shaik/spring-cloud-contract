package contracts.HelloEndpoint

import org.springframework.cloud.contract.spec.Contract
[
	Contract.make {
		name("requestWithInvalidURI")
		request {
			method GET()
			urlPath('/hellos')
		}
		response {
			status NOT_FOUND()
		}
	}
]