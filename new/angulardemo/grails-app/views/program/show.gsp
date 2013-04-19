
<%@ page import="angulardemo.Program" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'program.label', default: 'Program')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-program" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-program" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list program">
			
				<g:if test="${programInstance?.campaigns}">
				<li class="fieldcontain">
					<span id="campaigns-label" class="property-label"><g:message code="program.campaigns.label" default="Campaigns" /></span>
					
						<g:each in="${programInstance.campaigns}" var="c">
						<span class="property-value" aria-labelledby="campaigns-label"><g:link controller="campaign" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${programInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="program.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${programInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${programInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="program.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${programInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${programInstance?.id}" />
					<g:link class="edit" action="edit" id="${programInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
