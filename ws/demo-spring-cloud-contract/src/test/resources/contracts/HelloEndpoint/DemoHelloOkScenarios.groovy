package contracts.HelloEndpoint

import org.springframework.cloud.contract.spec.Contract
[
	Contract.make {
		name("shouldReturnOk")
		request {
			method GET()
			urlPath('/hello')
		}
		response {
			status OK()
			body ("Hello World")
		}
	}
]